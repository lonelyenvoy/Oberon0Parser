package type;

public class ComparingSimpleExpressionNode extends Node {
    public Operator operator;
    public SimpleExpressionNode simpleExpressionNode;

    public ComparingSimpleExpressionNode(Operator operator, SimpleExpressionNode simpleExpressionNode) {
        this.operator = operator;
        this.simpleExpressionNode = simpleExpressionNode;
    }
}
