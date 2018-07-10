package type;


public class SelectedIdentifierNode extends FactorNode {
    public final IdentifierNode identifierNode;
    public final SelectorNode selectorNode;

    public SelectedIdentifierNode(IdentifierNode identifierNode, SelectorNode selectorNode) {
        if (identifierNode == null) {
            throw new IllegalArgumentException("identifierNode cannot be null");
        }
        if (selectorNode == null) {
            throw new IllegalArgumentException("selectorNode cannot be null");
        }
        this.identifierNode = identifierNode;
        this.selectorNode = selectorNode;
    }

    @Override
    public String toString() {
        return identifierNode.toString() + selectorNode.toString();
    }
}
