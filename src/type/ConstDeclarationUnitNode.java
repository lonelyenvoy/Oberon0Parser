package type;

public class ConstDeclarationUnitNode extends Node {
    public IdentifierNode identifierNode;
    public ExpressionNode expressionNode;

    public ConstDeclarationUnitNode(IdentifierNode identifierNode, ExpressionNode expressionNode) {
        this.identifierNode = identifierNode;
        this.expressionNode = expressionNode;
    }
}
