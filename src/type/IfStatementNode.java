package type;

import java.util.List;

public class IfStatementNode extends StatementNode {
    public ConditionalStatementUnitNode ifStatementUnitNode;
    public List<ConditionalStatementUnitNode> elseIfStatementUnitNodes;
    public StatementSequenceNode elseStatementSequenceNode; // nullable

    public IfStatementNode(ConditionalStatementUnitNode ifStatementUnitNode,
                           List<ConditionalStatementUnitNode> elseIfStatementUnitNodes,
                           StatementSequenceNode elseStatementSequenceNode) {
        this.ifStatementUnitNode = ifStatementUnitNode;
        this.elseIfStatementUnitNodes = elseIfStatementUnitNodes;
        this.elseStatementSequenceNode = elseStatementSequenceNode;
    }
}
