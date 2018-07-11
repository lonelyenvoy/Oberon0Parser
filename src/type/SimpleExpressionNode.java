package type;

import type.base.Node;
import type.base.Normative;

import java.util.Deque;

public class SimpleExpressionNode extends Node implements Normative {
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(prefixOperator.toString());
        builder.append(termNode.toString());
        for (OperatedTermNode node : operatedTermNodes) {
            builder.append(" ");
            builder.append(node.toString());
        }
        return builder.toString();
    }

    @Override
    public String toNormativeString() {
        StringBuilder builder = new StringBuilder();
        builder.append(prefixOperator.toNormativeString());
        builder.append(termNode.toNormativeString());
        for (OperatedTermNode node : operatedTermNodes) {
            builder.append(" ");
            builder.append(node.toNormativeString());
        }
        return builder.toString();
    }
}
