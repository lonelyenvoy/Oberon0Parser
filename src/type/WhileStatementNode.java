package type;

public class WhileStatementNode extends StatementNode {
    public ConditionalStatementUnitNode conditionalStatementUnitNode;

    public WhileStatementNode(ExpressionNode expressionNode,
                              StatementSequenceNode statementSequenceNode) {
        conditionalStatementUnitNode = new ConditionalStatementUnitNode(expressionNode, statementSequenceNode);
    }
}
