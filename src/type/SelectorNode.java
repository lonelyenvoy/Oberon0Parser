package type;

import type.base.Node;
import type.base.NodeDequeContainer;

import java.util.ArrayDeque;
import java.util.Deque;

public class SelectorNode extends Node implements NodeDequeContainer<SelectorUnitNode> {
    public final Deque<SelectorUnitNode> selectorUnitNodes = new ArrayDeque<>();

    @Override
    public void addFirst(SelectorUnitNode unitNode) {
        if (unitNode == null) {
            throw new IllegalArgumentException("unitNode cannot be null");
        }
        selectorUnitNodes.addFirst(unitNode);
    }

    @Override
    public SelectorUnitNode getFirst() {
        return selectorUnitNodes.getFirst();
    }

    @Override
    public Deque<SelectorUnitNode> getContainer() {
        return selectorUnitNodes;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (SelectorUnitNode node : selectorUnitNodes) {
            builder.append(node.toString());
        }
        return builder.toString();
    }
}
