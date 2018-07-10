package type;

public class PrioritizedExpressionNode extends FactorNode {
    public ExpressionNode expressionNode;

    public PrioritizedExpressionNode(ExpressionNode expressionNode) {
        this.expressionNode = expressionNode;
    }
}
