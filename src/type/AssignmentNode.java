package type;

public class AssignmentNode extends StatementNode {
    public SelectedIdentifierNode selectedIdentifierNode;
    public ExpressionNode expressionNode;

    public AssignmentNode(SelectedIdentifierNode selectedIdentifierNode, ExpressionNode expressionNode) {
        this.selectedIdentifierNode = selectedIdentifierNode;
        this.expressionNode = expressionNode;
    }
}
