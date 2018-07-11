package type;

import type.base.Normative;

public class ActualParametersNode extends ExpressionsNode implements Normative {
    public ActualParametersNode() {
        super();
    }

    public ActualParametersNode(ExpressionsNode expressionsNode) {
        super(expressionsNode.getContainer());
    }

    @Override
    public String toString() {
        return "(" + super.toString() + ")";
    }

    @Override
    public String toNormativeString() {
        return "(" + super.toNormativeString() + ")";
    }
}
