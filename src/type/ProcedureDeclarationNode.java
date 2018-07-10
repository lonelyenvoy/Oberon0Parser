package type;

public class ProcedureDeclarationNode extends Node {
    public final ProcedureHeadingNode procedureHeadingNode;
    public final ProcedureBodyNode procedureBodyNode;

    public ProcedureDeclarationNode(ProcedureHeadingNode procedureHeadingNode, ProcedureBodyNode procedureBodyNode) {
        if (procedureHeadingNode == null) {
            throw new IllegalArgumentException("procedureHeadingNode cannot be null");
        }
        if (procedureBodyNode == null) {
            throw new IllegalArgumentException("procedureBodyNode cannot be null");
        }
        this.procedureHeadingNode = procedureHeadingNode;
        this.procedureBodyNode = procedureBodyNode;
    }
}
