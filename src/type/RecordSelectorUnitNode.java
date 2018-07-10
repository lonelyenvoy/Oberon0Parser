package type;

public class RecordSelectorUnitNode extends SelectorUnitNode {
    public final IdentifierNode identifierNode;

    public RecordSelectorUnitNode(IdentifierNode identifierNode) {
        if (identifierNode == null) {
            throw new IllegalArgumentException("identifierNode cannot be null");
        }
        this.identifierNode = identifierNode;
    }

    @Override
    public String toString() {
        return "." + identifierNode.toString();
    }
}
