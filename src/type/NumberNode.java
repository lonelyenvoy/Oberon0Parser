package type;

public class NumberNode extends FactorNode {
    public final Integer number;
    public NumberNode(Integer number) {
        if (number == null) {
            throw new IllegalArgumentException("number cannot be null");
        }
        this.number = number;
    }

    @Override
    public String toString() {
        return number.toString();
    }

    @Override
    public String toNormativeString() {
        return toString();
    }
}
