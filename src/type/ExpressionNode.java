package type;

public class ExpressionNode extends Node {
    public final SimpleExpressionNode leftSimpleExpressionNode;
    public final Operator operator;
    public final SimpleExpressionNode rightSimpleExpressionNode;
    public final boolean isSingle;

    public ExpressionNode(SimpleExpressionNode simpleExpressionNode) {
        if (simpleExpressionNode == null) {
            throw new IllegalArgumentException("simpleExpressionNode cannot be null");
        }
        this.leftSimpleExpressionNode = simpleExpressionNode;
        this.operator = null;
        this.rightSimpleExpressionNode = null;
        this.isSingle = true;
    }

    public ExpressionNode(SimpleExpressionNode leftSimpleExpressionNode,
                          Operator operator,
                          SimpleExpressionNode rightSimpleExpressionNode) {
        if (leftSimpleExpressionNode == null) {
            throw new IllegalArgumentException("leftSimpleExpressionNode cannot be null");
        }
        if (operator == null) {
            throw new IllegalArgumentException("operator cannot be null");
        }
        if (rightSimpleExpressionNode == null) {
            throw new IllegalArgumentException("rightSimpleExpressionNode cannot be null");
        }
        this.leftSimpleExpressionNode = leftSimpleExpressionNode;
        this.operator = operator;
        this.rightSimpleExpressionNode = rightSimpleExpressionNode;
        this.isSingle = false;
    }
}
