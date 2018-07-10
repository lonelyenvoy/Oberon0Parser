package type;

public class VarDeclarationUnitNode extends Node {
    public IdentifierListNode identifierListNode;
    public TypeNode typeNode;

    public VarDeclarationUnitNode(IdentifierListNode identifierListNode, TypeNode typeNode) {
        this.identifierListNode = identifierListNode;
        this.typeNode = typeNode;
    }
}
