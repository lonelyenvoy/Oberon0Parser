package type;

import type.base.NodeDequeContainer;

import java.util.ArrayDeque;
import java.util.Deque;

public class IdentifierListNode extends Node implements NodeDequeContainer<IdentifierNode> {
    public final Deque<IdentifierNode> identifierNodes = new ArrayDeque<>();

    @Override
    public void addFirst(IdentifierNode identifierNode) {
        if (identifierNode == null) {
            throw new IllegalArgumentException("identifierNode cannot be null");
        }
        identifierNodes.addFirst(identifierNode);
    }

    @Override
    public IdentifierNode getFirst() {
        return identifierNodes.getFirst();
    }

    @Override
    public Deque<IdentifierNode> getContainer() {
        return identifierNodes;
    }
}
