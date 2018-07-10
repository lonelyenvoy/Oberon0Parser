package type;

public class ConditionalStatementUnitNode extends Node {
    public final ExpressionNode expressionNode;
    public final StatementSequenceNode statementSequenceNode;

    public ConditionalStatementUnitNode(ExpressionNode expressionNode,
                                        StatementSequenceNode statementSequenceNode) {
        if (expressionNode == null) {
            throw new IllegalArgumentException("expressionNode cannot be null");
        }
        if (statementSequenceNode == null) {
            throw new IllegalArgumentException("statementSequenceNode cannot be null");
        }
        this.expressionNode = expressionNode;
        this.statementSequenceNode = statementSequenceNode;
    }
}
