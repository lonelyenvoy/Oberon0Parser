package type;

import java.util.List;

public class SelectedIdentifierNode extends FactorNode {
    public IdentifierNode identifierNode;
    public SelectorNode selectorNode;

    public SelectedIdentifierNode(IdentifierNode identifierNode, SelectorNode selectorNode) {
        this.identifierNode = identifierNode;
        this.selectorNode = selectorNode;
    }
}
