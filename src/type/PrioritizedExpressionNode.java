package type;

public class PrioritizedExpressionNode extends FactorNode {
    public final ExpressionNode expressionNode;

    public PrioritizedExpressionNode(ExpressionNode expressionNode) {
        if (expressionNode == null) {
            throw new IllegalArgumentException("expressionNode cannot be null");
        }
        this.expressionNode = expressionNode;
    }

    @Override
    public String toString() {
        return "(" + expressionNode.toString() + ")";
    }

    @Override
    public String toNormativeString() {
        return "(" + expressionNode.toNormativeString() + ")";
    }
}
