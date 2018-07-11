package type;

import java.util.Deque;

public class IfStatementNode extends StatementNode {
    public final ConditionalStatementUnitNode ifStatementUnitNode;
    public final Deque<ConditionalStatementUnitNode> elseIfStatementUnitNodes;
    public final StatementSequenceNode elseStatementSequenceNode;

    public IfStatementNode(ConditionalStatementUnitNode ifStatementUnitNode,
                           Deque<ConditionalStatementUnitNode> elseIfStatementUnitNodes,
                           StatementSequenceNode elseStatementSequenceNode) {
        if (ifStatementUnitNode == null) {
            throw new IllegalArgumentException("ifStatementUnitNode cannot be null");
        }
        if (elseIfStatementUnitNodes == null) {
            throw new IllegalArgumentException("elseIfStatementUnitNodes cannot be null");
        }
        if (elseStatementSequenceNode == null) {
            throw new IllegalArgumentException("elseStatementSequenceNode cannot be null");
        }
        this.ifStatementUnitNode = ifStatementUnitNode;
        this.elseIfStatementUnitNodes = elseIfStatementUnitNodes;
        this.elseStatementSequenceNode = elseStatementSequenceNode;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("IF ")
                .append(ifStatementUnitNode.expressionNode.toString())
                .append(" THEN ")
                .append(ifStatementUnitNode.statementSequenceNode.toString());

        for (ConditionalStatementUnitNode elseIfStatementUnitNode : elseIfStatementUnitNodes) {
            builder.append(" ELSIF ")
                    .append(elseIfStatementUnitNode.expressionNode.toString())
                    .append(" THEN ")
                    .append(elseIfStatementUnitNode.statementSequenceNode.toString());
        }
        if (!elseStatementSequenceNode.getContainer().isEmpty()) {
            builder.append(" ELSE ")
                    .append(elseStatementSequenceNode.toString());
        }
        builder.append(" END");
        return builder.toString();
    }

    @Override
    public String toNormativeString() {
        StringBuilder builder = new StringBuilder();
        builder.append("IF ")
                .append(ifStatementUnitNode.expressionNode.toNormativeString())
                .append(" THEN ")
                .append(ifStatementUnitNode.statementSequenceNode.toNormativeString());

        for (ConditionalStatementUnitNode elseIfStatementUnitNode : elseIfStatementUnitNodes) {
            builder.append(" ELSIF ")
                    .append(elseIfStatementUnitNode.expressionNode.toNormativeString())
                    .append(" THEN ")
                    .append(elseIfStatementUnitNode.statementSequenceNode.toNormativeString());
        }
        if (!elseStatementSequenceNode.getContainer().isEmpty()) {
            builder.append(" ELSE ")
                    .append(elseStatementSequenceNode.toNormativeString());
        }
        builder.append(" END");
        return builder.toString();
    }
}
