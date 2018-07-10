package type;

import type.base.Node;

public class ProcedureBodyNode extends Node {
    public final DeclarationsNode declarationsNode;
    public final StatementSequenceNode beginStatementSequenceNode;
    public final IdentifierNode endIdentifierNode;

    public ProcedureBodyNode(DeclarationsNode declarationsNode,
                             StatementSequenceNode beginStatementSequenceNode,
                             IdentifierNode endIdentifierNode) {
        if (declarationsNode == null) {
            throw new IllegalArgumentException("declarationsNode cannot be null");
        }
        if (beginStatementSequenceNode == null) {
            throw new IllegalArgumentException("beginStatementSequenceNode cannot be null");
        }
        if (endIdentifierNode == null) {
            throw new IllegalArgumentException("endIdentifierNode cannot be null");
        }
        this.declarationsNode = declarationsNode;
        this.beginStatementSequenceNode = beginStatementSequenceNode;
        this.endIdentifierNode = endIdentifierNode;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String declarationString = declarationsNode.toString();
        builder.append(declarationString);
        if (!beginStatementSequenceNode.getContainer().isEmpty()) {
            builder.append("BEGIN ");
            builder.append(beginStatementSequenceNode.toString());
        }
        builder.append("END ");
        builder.append(endIdentifierNode.toString());
        return builder.toString();
    }
}
