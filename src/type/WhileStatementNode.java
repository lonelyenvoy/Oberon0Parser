package type;

public class WhileStatementNode extends StatementNode {
    public final ConditionalStatementUnitNode conditionalStatementUnitNode;

    public WhileStatementNode(ExpressionNode expressionNode,
                              StatementSequenceNode statementSequenceNode) {
        conditionalStatementUnitNode = new ConditionalStatementUnitNode(expressionNode, statementSequenceNode);
    }

    @Override
    public String toString() {
        return "WHILE " + conditionalStatementUnitNode.expressionNode.toString()
                + " DO " + conditionalStatementUnitNode.statementSequenceNode.toString() + " END";
    }
}
