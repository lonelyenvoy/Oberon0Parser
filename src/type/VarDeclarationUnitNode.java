package type;

import type.base.Node;

public class VarDeclarationUnitNode extends Node {
    public final IdentifierListNode identifierListNode;
    public final TypeNode typeNode;

    public VarDeclarationUnitNode(IdentifierListNode identifierListNode, TypeNode typeNode) {
        if (identifierListNode == null) {
            throw new IllegalArgumentException("identifierListNode cannot be null");
        }
        if (typeNode == null) {
            throw new IllegalArgumentException("typeNode cannot be null");
        }
        this.identifierListNode = identifierListNode;
        this.typeNode = typeNode;
    }
}
