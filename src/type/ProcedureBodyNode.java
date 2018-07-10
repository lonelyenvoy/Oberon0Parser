package type;

public class ProcedureBodyNode extends Node {
    public DeclarationsNode declarationsNode;
    public StatementSequenceNode beginStatementSequenceNode;
    public IdentifierNode endIdentifierNode;

    public ProcedureBodyNode(DeclarationsNode declarationsNode,
                             StatementSequenceNode beginStatementSequenceNode,
                             IdentifierNode endIdentifierNode) {
        this.declarationsNode = declarationsNode;
        this.beginStatementSequenceNode = beginStatementSequenceNode;
        this.endIdentifierNode = endIdentifierNode;
    }
}
