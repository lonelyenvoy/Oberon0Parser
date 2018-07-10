package type;

import type.base.Node;

import java.util.Deque;

public class SimpleExpressionNode extends Node {
    public final Operator prefixOperator;
    public final TermNode termNode;
    public final Deque<OperatedTermNode> operatedTermNodes;

    public SimpleExpressionNode(Operator prefixOperator,
                                TermNode termNode,
                                Deque<OperatedTermNode> operatedTermNodes) {
        if (prefixOperator == null) {
            throw new IllegalArgumentException("prefixOperator cannot be null");
        }
        if (termNode == null) {
            throw new IllegalArgumentException("termNode cannot be null");
        }
        if (operatedTermNodes == null) {
            throw new IllegalArgumentException("operatedTermNodes cannot be null");
        }
        this.prefixOperator = prefixOperator;
        this.termNode = termNode;
        this.operatedTermNodes = operatedTermNodes;
    }
}
