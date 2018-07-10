package type;

public class ConditionalStatementUnitNode extends Node {
    public ExpressionNode expressionNode;
    public StatementSequenceNode statementSequenceNode;

    public ConditionalStatementUnitNode(ExpressionNode expressionNode,
                                        StatementSequenceNode statementSequenceNode) {
        this.expressionNode = expressionNode;
        this.statementSequenceNode = statementSequenceNode;
    }
}
