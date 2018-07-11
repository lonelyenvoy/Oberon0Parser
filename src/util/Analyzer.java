package util;

import exception.analyzer.*;
import type.*;
import type.base.Node;

import java.util.*;

/**
 * Oberon-0 Code Analyzer.
 * Does not support nested procedures.
 * In alpha
 */
public class Analyzer {
    public static void analyze(ModuleNode moduleNode) {
        Map<String, IdentifierInfo> moduleIdentifierMap = new HashMap<>();
        Set<String> procedureSet = new HashSet<>();
        Set<String> usedIdentifierSet = new HashSet<>();
        Set<String> moduleRecordSet = new HashSet<>();
        List<AnalyzerException> exceptions = new ArrayList<>();

        if (!moduleNode.beginIdentifierNode.toString().equals(moduleNode.endIdentifierNode.toString())) {
            exceptions.add(new InconsistentIdentifierException(
                    "Module <" + moduleNode.beginIdentifierNode.toString() + "> has inconsistent identifiers"));
        }
        exceptions.addAll(analyzeDeclarationsNode(
                moduleNode.declarationsNode, moduleIdentifierMap, procedureSet, usedIdentifierSet, moduleRecordSet, moduleNode));

        for (AnalyzerException e : exceptions) {
            e.printStackTrace();
        }
    }

    private static List<AnalyzerException> analyzeDeclarationsNode(
            DeclarationsNode node,
            Map<String, IdentifierInfo> identifierMap,
            Set<String> usedIdentifierSet,
            Set<String> procedureSet,
            Set<String> recordSet,
            Node parentNode) {
        List<AnalyzerException> exceptions = new ArrayList<>();
        for (ConstDeclarationUnitNode constDeclarationUnitNode : node.constDeclarationNode.getContainer()) {
            String identifier = constDeclarationUnitNode.identifierNode.toString();
            if (identifierMap.containsKey(identifier)) {
                exceptions.add(new DuplicatedDeclarationException("Duplicate identifier <" + identifier
                        + "> in const declaration of module <" + parentNode.toString() + ">"));
            } else {
                identifierMap.put(identifier, new IdentifierInfo(DataType.UNKNOWN, true));
            }
        }
        for (VarDeclarationUnitNode varDeclarationUnitNode : node.varDeclarationNode.getContainer()) {
            AnalyzerResponse<DataType> response = analyzeType(varDeclarationUnitNode.typeNode, recordSet, parentNode);
            DataType type = response.result;
            exceptions.addAll(response.exceptions);

            for (IdentifierNode identifierNode : varDeclarationUnitNode.identifierListNode.getContainer()) {
                String identifier = identifierNode.toString();
                if (identifierMap.containsKey(identifier)) {
                    exceptions.add(new DuplicatedDeclarationException("Duplicate identifier <" + identifier
                            + "> in var declaration of module <" + parentNode.toString() + ">"));
                } else {
                    identifierMap.put(identifier, new IdentifierInfo(type, false));
                }
            }
        }
        for (ProcedureDeclarationNode procedureDeclarationNode : node.procedureDeclarationNodes) {
            String procedureIdentifier = procedureDeclarationNode.procedureHeadingNode.identifierNode.toString();
            if (procedureSet.contains(procedureIdentifier)) {
                exceptions.add(new DuplicatedDeclarationException("Duplicate procedure <" + procedureIdentifier + ">"));
            } else {
                procedureSet.add(procedureIdentifier);
            }
            Map<String, IdentifierInfo> procedureIdentifierMap = new HashMap<>();
            Set<String> procedureRecordSet = new HashSet<>();

            for (FormalParameterSectionNode formalParameterSectionNode
                    : procedureDeclarationNode.procedureHeadingNode.formalParametersNode.formalParameterSectionNodes) {
                AnalyzerResponse<DataType> response = analyzeType(formalParameterSectionNode.typeNode,
                        recordSet,
                        procedureDeclarationNode);
                DataType type = response.result;
                exceptions.addAll(response.exceptions);

                for (IdentifierNode identifierNode : formalParameterSectionNode.identifierListNode.getContainer()) {
                    String identifier = identifierNode.toString();
                    if (procedureIdentifierMap.containsKey(identifier) || identifierMap.containsKey(identifier)) {
                        exceptions.add(new DuplicatedDeclarationException("Duplicate identifier <" + identifier
                                + "> in procedure <" + procedureDeclarationNode.toString() + ">"));
                    } else {
                        procedureIdentifierMap.put(identifier, new IdentifierInfo(type, false));
                    }
                }
            }

            Map<String, IdentifierInfo> combinedIdentifierMap = new HashMap<>() {{
                putAll(procedureIdentifierMap);
                putAll(identifierMap);
            }};
            exceptions.addAll(analyzeDeclarationsNode(
                    procedureDeclarationNode.procedureBodyNode.declarationsNode,
                    combinedIdentifierMap, usedIdentifierSet, procedureSet, recordSet, node));

            if (!procedureDeclarationNode.procedureHeadingNode.identifierNode.toString()
                    .equalsIgnoreCase(procedureDeclarationNode.procedureBodyNode.endIdentifierNode.toString())) {
                exceptions.add(
                        new InconsistentIdentifierException(
                                "Procedure <" + procedureDeclarationNode.procedureHeadingNode.identifierNode.toString()
                                        + "> has inconsistent identifiers"));
            }

            for (StatementNode statementNode : procedureDeclarationNode.procedureBodyNode.beginStatementSequenceNode.getContainer()) {
                exceptions.addAll(analyzeStatementNode(statementNode, combinedIdentifierMap, usedIdentifierSet, procedureSet, node));
            }
        }
        return exceptions;
    }

    private static List<AnalyzerException> analyzeStatementNode(
            StatementNode statementNode,
            Map<String, IdentifierInfo> identifierMap,
            Set<String> usedIdentifierSet,
            Set<String> procedureSet,
            Node parentNode) {
        List<AnalyzerException> exceptions = new ArrayList<>();
        if (statementNode instanceof NullStatementNode) {
            // ignore
        } else if (statementNode instanceof AssignmentNode) {
            String identifier = ((AssignmentNode) statementNode).selectedIdentifierNode.identifierNode.toString();
            if (!identifierMap.containsKey(identifier)) {
                exceptions.add(new ReferenceException("Identifier <" + identifier + "> is not defined in <" + parentNode.toString() + ">"));
            } else {
                IdentifierInfo info = identifierMap.get(identifier);
                if (info.isConst) {
                    exceptions.add(new IllegalAssignmentException("Cannot assign to constant <" + identifier + "> in <" + parentNode.toString() + ">"));
                } else {
                    usedIdentifierSet.add(identifier);
                }
            }
        } else if (statementNode instanceof ProcedureCallNode) {
            String identifier = ((ProcedureCallNode) statementNode).identifierNode.toString();
            if (!procedureSet.contains(identifier)) {
                exceptions.add(new ReferenceException("Procedure <" + identifier + "> is not defined in <" + parentNode.toString() + ">"));
            }
        } else if (statementNode instanceof IfStatementNode) {
            // TODO analyze expressions
            for (StatementNode node : ((IfStatementNode) statementNode).ifStatementUnitNode.statementSequenceNode.getContainer()) {
                exceptions.addAll(analyzeStatementNode(node, identifierMap, usedIdentifierSet, procedureSet, statementNode));
            }
            for (ConditionalStatementUnitNode conditionalStatementUnitNode : ((IfStatementNode) statementNode).elseIfStatementUnitNodes) {
                for (StatementNode node : conditionalStatementUnitNode.statementSequenceNode.getContainer()) {
                    exceptions.addAll(analyzeStatementNode(node, identifierMap, usedIdentifierSet, procedureSet, statementNode));
                }
            }
            for (StatementNode node : ((IfStatementNode) statementNode).elseStatementSequenceNode.getContainer()) {
                exceptions.addAll(analyzeStatementNode(node, identifierMap, usedIdentifierSet, procedureSet, statementNode));
            }
        } else if (statementNode instanceof WhileStatementNode) {
            // TODO analyze expressions
            for (StatementNode node : ((WhileStatementNode) statementNode).conditionalStatementUnitNode.statementSequenceNode.getContainer()) {
                exceptions.addAll(analyzeStatementNode(node, identifierMap, usedIdentifierSet, procedureSet, statementNode));
            }
        }
        return exceptions;
    }

    private static AnalyzerResponse<DataType> analyzeType(TypeNode node, Set<String> recordSet, Node parentNode) {
        DataType type;
        List<AnalyzerException> exceptions = new ArrayList<>();
        if (node instanceof ArrayTypeNode) {
            type = DataType.ARRAY;
        } else if (node instanceof RecordTypeNode) {
            type = DataType.RECORD;
        } else {
            String typeString = node.toString();
            if (typeString.equalsIgnoreCase("integer")) {
                type = DataType.INTEGER;
            } else if (typeString.equalsIgnoreCase("boolean")) {
                type = DataType.BOOLEAN;
            } else if (recordSet.contains(typeString)) {
                type = DataType.RECORD;
            } else {
                exceptions.add(new UnrecognizedTypeException(
                        "Unrecognized type <" + typeString + "> in variable declaration of <"
                                + parentNode.toString() + ">"));
                type = DataType.UNKNOWN;
            }
        }
        return new AnalyzerResponse<>(type, exceptions);
    }
}

class IdentifierInfo {
    public final DataType dataType;
    public final boolean isConst;

    public IdentifierInfo(DataType dataType, boolean isConst) {
        this.dataType = dataType;
        this.isConst = isConst;
    }
}

class AnalyzerResponse<T> {
    public final T result;
    public final List<AnalyzerException> exceptions;

    public AnalyzerResponse(T result, List<AnalyzerException> exceptions) {
        this.result = result;
        this.exceptions = exceptions;
    }
}
