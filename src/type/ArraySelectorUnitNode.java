package type;

public class ArraySelectorUnitNode extends SelectorUnitNode {
    public final ExpressionNode expressionNode;

    public ArraySelectorUnitNode(ExpressionNode expressionNode) {
        if (expressionNode == null) {
            throw new IllegalArgumentException("expressionNode cannot be null");
        }
        this.expressionNode = expressionNode;
    }

    @Override
    public String toString() {
        return "[" + expressionNode.toString() + "]";
    }

    @Override
    public String toNormativeString() {
        return "[" + expressionNode.toNormativeString() + "]";
    }
}
