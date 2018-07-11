package type;

public class NegatedFactorNode extends FactorNode {
    public final FactorNode factorNode;

    public NegatedFactorNode(FactorNode factorNode) {
        if (factorNode == null) {
            throw new IllegalArgumentException("factorNode cannot be null");
        }
        this.factorNode = factorNode;
    }

    @Override
    public String toString() {
        return factorNode.toString();
    }

    @Override
    public String toNormativeString() {
        return factorNode.toNormativeString();
    }
}
