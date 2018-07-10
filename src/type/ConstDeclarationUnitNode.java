package type;

import type.base.Node;

public class ConstDeclarationUnitNode extends Node {
    public final IdentifierNode identifierNode;
    public final ExpressionNode expressionNode;

    public ConstDeclarationUnitNode(IdentifierNode identifierNode, ExpressionNode expressionNode) {
        if (identifierNode == null) {
            throw new IllegalArgumentException("identifierNode cannot be null");
        }
        if (expressionNode == null) {
            throw new IllegalArgumentException("expressionNode cannot be null");
        }
        this.identifierNode = identifierNode;
        this.expressionNode = expressionNode;
    }
}
