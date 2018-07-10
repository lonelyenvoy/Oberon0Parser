package type;

import java.util.ArrayList;
import java.util.List;

public class StatementSequenceNode extends Node {
    public List<StatementNode> statementNodes = new ArrayList<>();

    public List<StatementNode> getStatements() {
        return statementNodes;
    }

    public void add(StatementNode statementNode) {
        statementNodes.add(statementNode);
    }
}
