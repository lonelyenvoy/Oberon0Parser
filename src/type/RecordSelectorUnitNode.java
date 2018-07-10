package type;

public class RecordSelectorUnitNode extends SelectorUnitNode {
    public IdentifierNode identifierNode;

    public RecordSelectorUnitNode(IdentifierNode identifierNode) {
        this.identifierNode = identifierNode;
    }
}
