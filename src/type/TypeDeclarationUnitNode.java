package type;

import type.base.Node;

public class TypeDeclarationUnitNode extends Node {
    public final IdentifierNode identifierNode;
    public final TypeNode typeNode;

    public TypeDeclarationUnitNode(IdentifierNode identifierNode, TypeNode typeNode) {
        if (identifierNode == null) {
            throw new IllegalArgumentException("identifierNode cannot be null");
        }
        if (typeNode == null) {
            throw new IllegalArgumentException("typeNode cannot be null");
        }
        this.identifierNode = identifierNode;
        this.typeNode = typeNode;
    }
}
