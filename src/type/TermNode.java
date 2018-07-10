package type;

import type.base.Node;

import java.util.Deque;

public class TermNode extends Node {
    public final FactorNode factorNode;
    public final Deque<OperatedFactorNode> operatedFactorNodes;

    public TermNode(FactorNode factorNode, Deque<OperatedFactorNode> operatedFactorNodes) {
        if (factorNode == null) {
            throw new IllegalArgumentException("factorNode cannot be null");
        }
        if (operatedFactorNodes == null) {
            throw new IllegalArgumentException("operatedFactorNodes cannot be null");
        }
        this.factorNode = factorNode;
        this.operatedFactorNodes = operatedFactorNodes;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(factorNode.toString());
        boolean first = true;
        for (OperatedFactorNode node : operatedFactorNodes) {
            if (first) first = false;
            else builder.append(" ");
            builder.append(node.toString());
        }
        return builder.toString();
    }
}
