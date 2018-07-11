package type;

import type.base.Node;
import type.base.Normative;

public class OperatedFactorNode extends Node implements Normative {
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

    @Override
    public String toString() {
        return operator.toString() + " " + factorNode.toString();
    }

    @Override
    public String toNormativeString() {
        return operator.toNormativeString() + " " + factorNode.toNormativeString();
    }
}
