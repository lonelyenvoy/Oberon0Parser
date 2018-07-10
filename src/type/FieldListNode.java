package type;

public class FieldListNode extends Node {
    public IdentifierListNode identifierListNode;
    public TypeNode typeNode;

    public FieldListNode(IdentifierListNode identifierListNode, TypeNode typeNode) {
        this.identifierListNode = identifierListNode;
        this.typeNode = typeNode;
    }
}
