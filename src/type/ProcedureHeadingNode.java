package type;

public class ProcedureHeadingNode extends Node {
    public final IdentifierNode identifierNode;
    public final FormalParametersNode formalParametersNode;

    public ProcedureHeadingNode(IdentifierNode identifierNode, FormalParametersNode formalParametersNode) {
        if (identifierNode == null) {
            throw new IllegalArgumentException("identifierNode cannot be null");
        }
        if (formalParametersNode == null) {
            throw new IllegalArgumentException("formalParametersNode cannot be null");
        }
        this.identifierNode = identifierNode;
        this.formalParametersNode = formalParametersNode;
    }
}
