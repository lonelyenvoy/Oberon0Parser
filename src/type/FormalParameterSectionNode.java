package type;

public class FormalParameterSectionNode extends Node {
    public boolean isVar;
    public IdentifierListNode identifierListNode;
    public TypeNode typeNode;

    public FormalParameterSectionNode(boolean isVar,
                                      IdentifierListNode identifierListNode,
                                      TypeNode typeNode) {
        this.isVar = isVar;
        this.identifierListNode = identifierListNode;
        this.typeNode = typeNode;
    }
}
