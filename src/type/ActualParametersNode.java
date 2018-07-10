package type;

public class ActualParametersNode extends ExpressionsNode {
    public ActualParametersNode() {
        super();
    }

    public ActualParametersNode(ExpressionsNode expressionsNode) {
        super(expressionsNode.getContainer());
    }
}
