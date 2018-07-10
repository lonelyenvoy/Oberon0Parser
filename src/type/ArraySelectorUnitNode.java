package type;

public class ArraySelectorUnitNode extends SelectorUnitNode {
    public ExpressionNode expressionNode;

    public ArraySelectorUnitNode(ExpressionNode expressionNode) {
        this.expressionNode = expressionNode;
    }
}
