package type;

public class ProcedureDeclarationNode extends Node {
    public ProcedureHeadingNode procedureHeadingNode;
    public ProcedureBodyNode procedureBodyNode;

    public ProcedureDeclarationNode(ProcedureHeadingNode procedureHeadingNode, ProcedureBodyNode procedureBodyNode) {
        this.procedureHeadingNode = procedureHeadingNode;
        this.procedureBodyNode = procedureBodyNode;
    }
}
