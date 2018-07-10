package type;

public class OperatedFactorNode extends Node {
    public Operator operator;
    public FactorNode factorNode;

    public OperatedFactorNode(Operator operator, FactorNode factorNode) {
        this.operator = operator;
        this.factorNode = factorNode;
    }
}
