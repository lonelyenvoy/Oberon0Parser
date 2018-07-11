package type;

import type.base.Node;
import type.base.NodeDequeContainer;
import type.base.Normative;

import java.util.ArrayDeque;
import java.util.Deque;

public class StatementSequenceNode extends Node implements NodeDequeContainer<StatementNode>, Normative {
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        boolean first = true;
        for (StatementNode statementNode : statementNodes) {
            if (first) first = false;
            else builder.append("; ");
            builder.append(statementNode.toString());
        }
        return builder.toString();
    }

    @Override
    public String toNormativeString() {
        StringBuilder builder = new StringBuilder();
        boolean first = true;
        for (StatementNode statementNode : statementNodes) {
            if (first) first = false;
            else builder.append("; ");
            builder.append(statementNode.toNormativeString());
        }
        return builder.toString();
    }
}
