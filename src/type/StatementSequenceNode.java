package type;

import type.base.NodeDequeContainer;

import java.util.ArrayDeque;
import java.util.Deque;

public class StatementSequenceNode extends Node implements NodeDequeContainer<StatementNode> {
    public final Deque<StatementNode> statementNodes = new ArrayDeque<>();

    @Override
    public void addFirst(StatementNode statementNode) {
        if (statementNode == null) {
            throw new IllegalArgumentException("statementNode cannot be null");
        }
        statementNodes.addFirst(statementNode);
    }

    @Override
    public StatementNode getFirst() {
        return statementNodes.getFirst();
    }

    @Override
    public Deque<StatementNode> getContainer() {
        return statementNodes;
    }
}
