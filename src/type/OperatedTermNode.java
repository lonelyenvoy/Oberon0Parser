package type;

import type.base.Node;

public class OperatedTermNode extends Node {
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
}
