package type;

import type.base.Node;
import type.base.Normative;

public class OperatedTermNode extends Node implements Normative {
    public final Operator operator;
    public final TermNode termNode;

    public OperatedTermNode(Operator operator, TermNode termNode) {
        if (operator == null) {
            throw new IllegalArgumentException("operator cannot be null");
        }
        if (termNode == null) {
            throw new IllegalArgumentException("termNode cannot be null");
        }
        this.operator = operator;
        this.termNode = termNode;
    }

    @Override
    public String toString() {
        return operator.toString() + " " + termNode.toString();
    }

    @Override
    public String toNormativeString() {
        return operator.toNormativeString() + " " + termNode.toNormativeString();
    }
}
