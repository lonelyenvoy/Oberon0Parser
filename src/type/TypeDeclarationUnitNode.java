package type;

public class TypeDeclarationUnitNode {
    public IdentifierNode identifierNode;
    public TypeNode typeNode;

    public TypeDeclarationUnitNode(IdentifierNode identifierNode, TypeNode typeNode) {
        this.identifierNode = identifierNode;
        this.typeNode = typeNode;
    }
}
