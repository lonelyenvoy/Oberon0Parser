package type;

import type.base.Node;

public class FormalParameterSectionNode extends Node {
    public final boolean isVar;
    public final IdentifierListNode identifierListNode;
    public final TypeNode typeNode;

    public FormalParameterSectionNode(boolean isVar,
                                      IdentifierListNode identifierListNode,
                                      TypeNode typeNode) {
        if (identifierListNode == null) {
            throw new IllegalArgumentException("identifierListNode cannot be null");
        }
        if (typeNode == null) {
            throw new IllegalArgumentException("typeNode cannot be null");
        }
        this.isVar = isVar;
        this.identifierListNode = identifierListNode;
        this.typeNode = typeNode;
    }
}
