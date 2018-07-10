package type;

import java.util.ArrayList;
import java.util.List;

public class SelectorNode extends Node {
    public List<SelectorUnitNode> selectorUnitNodes = new ArrayList<>();

    public List<SelectorUnitNode> getUnits() {
        return selectorUnitNodes;
    }

    public void add(SelectorUnitNode unitNode) {
        selectorUnitNodes.add(unitNode);
    }
}
