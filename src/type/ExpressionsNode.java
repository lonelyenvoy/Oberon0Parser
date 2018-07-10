package type;

import type.base.NodeDequeContainer;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExpressionsNode extends Node implements NodeDequeContainer<ExpressionNode> {
    public final Deque<ExpressionNode> expressionNodes;

    public ExpressionsNode() {
        this.expressionNodes = new ArrayDeque<>();
    }
    protected ExpressionsNode(Deque<ExpressionNode> expressionNodes) {
        this.expressionNodes = expressionNodes;
    }

    @Override
    public void addFirst(ExpressionNode expressionNode) {
        if (expressionNode == null) {
            throw new IllegalArgumentException("expressionNode cannot be null");
        }
        expressionNodes.addFirst(expressionNode);
    }

    @Override
    public ExpressionNode getFirst() {
        return expressionNodes.getFirst();
    }

    @Override
    public Deque<ExpressionNode> getContainer() {
        return expressionNodes;
    }
}
