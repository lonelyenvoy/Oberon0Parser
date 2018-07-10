package type;

import type.base.Node;

public class ComparingSimpleExpressionNode extends Node {
    public final Operator operator;
    public final SimpleExpressionNode simpleExpressionNode;

    public ComparingSimpleExpressionNode(Operator operator, SimpleExpressionNode simpleExpressionNode) {
        if (operator == null) {
            throw new IllegalArgumentException("operator cannot be null");
        }
        if (simpleExpressionNode == null) {
            throw new IllegalArgumentException("simpleExpressionNode cannot be null");
        }
        this.operator = operator;
        this.simpleExpressionNode = simpleExpressionNode;
    }

    @Override
    public String toString() {
        return operator.toString() + " " + simpleExpressionNode.toString();
    }
}
