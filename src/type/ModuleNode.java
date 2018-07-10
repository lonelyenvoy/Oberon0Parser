package type;

public class ModuleNode extends Node {
    public IdentifierNode beginIdentifierNode;
    public DeclarationsNode declarationsNode;
    public StatementSequenceNode statementSequenceNode;
    public IdentifierNode endIdentifierNode;

    public ModuleNode(IdentifierNode beginIdentifierNode,
                      DeclarationsNode declarationsNode,
                      StatementSequenceNode statementSequenceNode,
                      IdentifierNode endIdentifierNode) {
        this.beginIdentifierNode = beginIdentifierNode;
        this.declarationsNode = declarationsNode;
        this.statementSequenceNode = statementSequenceNode;
        this.endIdentifierNode = endIdentifierNode;
    }
}
