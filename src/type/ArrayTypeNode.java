package type;

public class ArrayTypeNode extends TypeNode {
    public final ExpressionNode expressionNode;
    public final TypeNode typeNode;

    public ArrayTypeNode(ExpressionNode expressionNode, TypeNode typeNode) {
        if (expressionNode == null) {
            throw new IllegalArgumentException("expressionNode cannot be null");
        }
        if (typeNode == null) {
            throw new IllegalArgumentException("typeNode cannot be null");
        }
        this.expressionNode = expressionNode;
        this.typeNode = typeNode;
    }
}
