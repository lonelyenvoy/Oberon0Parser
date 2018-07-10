package type;

public class OperatedFactorNode extends Node {
    public final Operator operator;
    public final FactorNode factorNode;

    public OperatedFactorNode(Operator operator, FactorNode factorNode) {
        if (operator == null) {
            throw new IllegalArgumentException("operator cannot be null");
        }
        if (factorNode == null) {
            throw new IllegalArgumentException("factorNode cannot be null");
        }
        this.operator = operator;
        this.factorNode = factorNode;
    }
}
