package type;

public class ActualParametersNode extends ExpressionsNode {
    public ActualParametersNode() {
        super();
    }

    public ActualParametersNode(ExpressionsNode expressionsNode) {
        if (expressionsNode == null) {
            throw new IllegalArgumentException("expressionsNode cannot be null");
        }
        this.expressionNodes = expressionsNode.getExpressions();
    }
}
