package type;

public class IdentifierTypeNode extends TypeNode {
    public final IdentifierNode identifierNode;

    public IdentifierTypeNode(IdentifierNode identifierNode) {
        if (identifierNode == null) {
            throw new IllegalArgumentException("identifierNode cannot be null");
        }
        this.identifierNode = identifierNode;
    }
}
