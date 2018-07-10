package type;

import java.util.List;

public class SimpleExpressionNode extends Node {
    public Operator prefixOperator;
    public TermNode termNode;
    public List<OperatedTermNode> operatedTermNodes;

    public SimpleExpressionNode(Operator prefixOperator,
                                TermNode termNode,
                                List<OperatedTermNode> operatedTermNodes) {
        this.prefixOperator = prefixOperator;
        this.termNode = termNode;
        this.operatedTermNodes = operatedTermNodes;
    }
}
