package type;

public class ArraySelectorUnitNode extends SelectorUnitNode {
    public final ExpressionNode expressionNode;

    public ArraySelectorUnitNode(ExpressionNode expressionNode) {
        if (expressionNode == null) {
            throw new IllegalArgumentException("expressionNode cannot be null");
        }
        this.expressionNode = expressionNode;
    }
}
