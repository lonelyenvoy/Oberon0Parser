package type;

import java.util.List;

public class TermNode extends Node {
    public FactorNode factorNode;
    public List<OperatedFactorNode> operatedFactorNodes;

    public TermNode(FactorNode factorNode, List<OperatedFactorNode> operatedFactorNodes) {
        this.factorNode = factorNode;
        this.operatedFactorNodes = operatedFactorNodes;
    }
}
