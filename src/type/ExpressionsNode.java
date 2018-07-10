package type;

import java.util.ArrayList;
import java.util.List;

public class ExpressionsNode extends Node {
    public List<ExpressionNode> expressionNodes = new ArrayList<>();

    public List<ExpressionNode> getExpressions() {
        return expressionNodes;
    }

    public void add(ExpressionNode expressionNode) {
        expressionNodes.add(expressionNode);
    }
}
