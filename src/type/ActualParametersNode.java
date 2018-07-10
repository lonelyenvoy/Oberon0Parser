package type;

public class ActualParametersNode extends ExpressionsNode {
    public ActualParametersNode() {
        super();
    }

    public ActualParametersNode(ExpressionsNode expressionsNode) {
        super(expressionsNode.getContainer());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        boolean first = true;
        for (ExpressionNode node : expressionNodes) {
            if (first) first = false;
            else builder.append(", ");
            builder.append(node.toString());
        }
        builder.append(")");
        return builder.toString();
    }
}
