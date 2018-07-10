package type;

public class NegatedFactorNode extends FactorNode {
    public final FactorNode factorNode;

    public NegatedFactorNode(FactorNode factorNode) {
        if (factorNode == null) {
            throw new IllegalArgumentException("factorNode cannot be null");
        }
        this.factorNode = factorNode;
    }
}
