package type;

public class NegatedFactorNode extends FactorNode {
    public FactorNode factorNode;

    public NegatedFactorNode(FactorNode factorNode) {
        this.factorNode = factorNode;
    }
}
