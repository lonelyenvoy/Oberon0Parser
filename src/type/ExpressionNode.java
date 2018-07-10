package type;

public class ExpressionNode extends Node {
    public SimpleExpressionNode leftSimpleExpressionNode;
    public Operator operator;
    public SimpleExpressionNode rightSimpleExpressionNode;
    public final boolean isSingle;

    public ExpressionNode(SimpleExpressionNode simpleExpressionNode) {
        this.leftSimpleExpressionNode = simpleExpressionNode;
        this.isSingle = true;
    }

    public ExpressionNode(SimpleExpressionNode leftSimpleExpressionNode,
                          Operator operator,
                          SimpleExpressionNode rightSimpleExpressionNode) {
        this.leftSimpleExpressionNode = leftSimpleExpressionNode;
        this.operator = operator;
        this.rightSimpleExpressionNode = rightSimpleExpressionNode;
        this.isSingle = false;
    }
}
