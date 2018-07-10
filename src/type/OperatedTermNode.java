package type;

public class OperatedTermNode extends Node {
    public Operator operator;
    public TermNode termNode;

    public OperatedTermNode(Operator operator, TermNode termNode) {
        this.operator = operator;
        this.termNode = termNode;
    }
}
