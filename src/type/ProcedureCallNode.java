package type;

public class ProcedureCallNode extends StatementNode {
    public IdentifierNode identifierNode;
    public ActualParametersNode actualParametersNode;

    public ProcedureCallNode(IdentifierNode identifierNode, ActualParametersNode actualParametersNode) {
        this.identifierNode = identifierNode;
        this.actualParametersNode = actualParametersNode;
    }
}
