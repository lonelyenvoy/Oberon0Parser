package type;

public class ProcedureCallNode extends StatementNode {
    public final IdentifierNode identifierNode;
    public final ActualParametersNode actualParametersNode;

    public ProcedureCallNode(IdentifierNode identifierNode, ActualParametersNode actualParametersNode) {
        if (identifierNode == null) {
            throw new IllegalArgumentException("identifierNode cannot be null");
        }
        if (actualParametersNode == null) {
            throw new IllegalArgumentException("actualParametersNode cannot be null");
        }
        this.identifierNode = identifierNode;
        this.actualParametersNode = actualParametersNode;
    }
}
