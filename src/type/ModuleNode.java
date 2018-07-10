package type;

import type.base.Node;

public class ModuleNode extends Node {
    public final IdentifierNode beginIdentifierNode;
    public final DeclarationsNode declarationsNode;
    public final StatementSequenceNode statementSequenceNode;
    public final IdentifierNode endIdentifierNode;

    public ModuleNode(IdentifierNode beginIdentifierNode,
                      DeclarationsNode declarationsNode,
                      StatementSequenceNode statementSequenceNode,
                      IdentifierNode endIdentifierNode) {
        if (beginIdentifierNode == null) {
            throw new IllegalArgumentException("beginIdentifierNode cannot be null");
        }
        if (declarationsNode == null) {
            throw new IllegalArgumentException("declarationsNode cannot be null");
        }
        if (statementSequenceNode == null) {
            throw new IllegalArgumentException("statementSequenceNode cannot be null");
        }
        if (endIdentifierNode == null) {
            throw new IllegalArgumentException("endIdentifierNode cannot be null");
        }
        this.beginIdentifierNode = beginIdentifierNode;
        this.declarationsNode = declarationsNode;
        this.statementSequenceNode = statementSequenceNode;
        this.endIdentifierNode = endIdentifierNode;
    }
}
