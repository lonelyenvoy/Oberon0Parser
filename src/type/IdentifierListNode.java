package type;

import java.util.ArrayList;
import java.util.List;

public class IdentifierListNode extends Node {
    public List<IdentifierNode> identifierNodes = new ArrayList<>();

    public List<IdentifierNode> getIdentifiers() {
        return identifierNodes;
    }

    public void add(IdentifierNode identifierNode) {
        identifierNodes.add(identifierNode);
    }
}
