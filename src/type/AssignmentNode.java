package type;

public class AssignmentNode extends StatementNode {
    public final SelectedIdentifierNode selectedIdentifierNode;
    public final ExpressionNode expressionNode;

    public AssignmentNode(SelectedIdentifierNode selectedIdentifierNode, ExpressionNode expressionNode) {
        if (selectedIdentifierNode == null) {
            throw new IllegalArgumentException("selectedIdentifierNode cannot be null");
        }
        if (expressionNode == null) {
            throw new IllegalArgumentException("expressionNode cannot be null");
        }
        this.selectedIdentifierNode = selectedIdentifierNode;
        this.expressionNode = expressionNode;
    }

    @Override
    public String toString() {
        return selectedIdentifierNode.toString() + " := " + expressionNode.toString();
    }

    @Override
    public String toNormativeString() {
        return selectedIdentifierNode.toNormativeString() + " := " + expressionNode.toNormativeString();
    }
}
