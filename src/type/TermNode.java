package type;

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
}
