package type;

public class ArrayTypeNode extends TypeNode {
    public ExpressionNode expressionNode;
    public TypeNode typeNode;

    public ArrayTypeNode(ExpressionNode expressionNode, TypeNode typeNode) {
        this.expressionNode = expressionNode;
        this.typeNode = typeNode;
    }
}
