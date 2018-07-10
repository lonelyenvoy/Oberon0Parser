package type;

public class ProcedureHeadingNode extends Node {
    public IdentifierNode identifierNode;
    public FormalParametersNode formalParametersNode;

    public ProcedureHeadingNode(IdentifierNode identifierNode, FormalParametersNode formalParametersNode) {
        this.identifierNode = identifierNode;
        this.formalParametersNode = formalParametersNode;
    }
}
