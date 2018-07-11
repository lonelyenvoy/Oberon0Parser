package util;

import flowchart.*;
import flowchart.Module;
import type.*;

public class Visualizer {
    public static void visualize(ModuleNode rootNode) {
        Module module = new Module(rootNode.beginIdentifierNode.toString());
        for (ProcedureDeclarationNode procedureNode : rootNode.declarationsNode.procedureDeclarationNodes) {
            Procedure procedure = module.add(procedureNode.procedureHeadingNode.identifierNode.toString());
            for (StatementNode statementNode : procedureNode.procedureBodyNode.beginStatementSequenceNode.getContainer()) {
                drawStatementNode(procedure, statementNode);
            }
        }
        module.show();
    }

    private static<T> void drawStatementNode(T parent, StatementNode statementNode) {
        if (!(parent instanceof Procedure) && !(parent instanceof StatementSequence)) {
            throw new IllegalArgumentException("Illegal argument type of parent");
        }
        if (statementNode instanceof NullStatementNode) {
            // ignore
        } else if (statementNode instanceof AssignmentNode || statementNode instanceof ProcedureCallNode) {
            // add to parent
            addStatementToProcedureOrStatementSequence(parent, new PrimitiveStatement(statementNode.toNormativeString()));
        } else if (statementNode instanceof IfStatementNode) {
            // if
            IfStatement ifStatement = new IfStatement(((IfStatementNode) statementNode).ifStatementUnitNode.expressionNode.toNormativeString());
            for (StatementNode trueStatementNode : ((IfStatementNode) statementNode).ifStatementUnitNode.statementSequenceNode.getContainer()) {
                drawStatementNode(ifStatement.getTrueBody(), trueStatementNode);
            }
            IfStatement lastIfStatement = ifStatement;
            // else-if
            for (ConditionalStatementUnitNode elseIfStatementNode : ((IfStatementNode) statementNode).elseIfStatementUnitNodes) {
                IfStatement innerIfStatement = new IfStatement(elseIfStatementNode.expressionNode.toNormativeString());
                lastIfStatement.getFalseBody().add(innerIfStatement);

                for (StatementNode trueStatementNode : elseIfStatementNode.statementSequenceNode.getContainer()) {
                    drawStatementNode(innerIfStatement.getTrueBody(), trueStatementNode);
                }
                lastIfStatement = innerIfStatement;
            }
            // else
            for (StatementNode elseStatementNode : ((IfStatementNode) statementNode).elseStatementSequenceNode.getContainer()) {
                drawStatementNode(lastIfStatement.getFalseBody(), elseStatementNode);
            }
            // add to parent
            addStatementToProcedureOrStatementSequence(parent, ifStatement);
        } else if (statementNode instanceof WhileStatementNode) {
            WhileStatement whileStatement = new WhileStatement(((WhileStatementNode) statementNode).conditionalStatementUnitNode.expressionNode.toNormativeString());
            for (StatementNode whileStatementNode : ((WhileStatementNode) statementNode).conditionalStatementUnitNode.statementSequenceNode.getContainer()) {
                drawStatementNode(whileStatement.getLoopBody(), whileStatementNode);
            }
            // add to parent
            addStatementToProcedureOrStatementSequence(parent, whileStatement);
        }
    }

    private static<T> void addStatementToProcedureOrStatementSequence(T parent, AbstractStatement statement) {
        if (parent instanceof Procedure) {
            ((Procedure) parent).add(statement);
        } else if (parent instanceof StatementSequence) {
            ((StatementSequence) parent).add(statement);
        } else {
            throw new IllegalArgumentException("Illegal argument type of parent, must be Procedure or StatementSequence");
        }
    }
}
