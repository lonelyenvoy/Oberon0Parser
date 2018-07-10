package type;

import java.util.List;

public class ConstDeclarationNode extends Node {
    public List<ConstDeclarationUnitNode> constDeclarationUnitNodes;

    public ConstDeclarationNode() {

    }
    public ConstDeclarationNode(List<ConstDeclarationUnitNode> constDeclarationUnitNodes) {
        this.constDeclarationUnitNodes = constDeclarationUnitNodes;
    }

    public List<ConstDeclarationUnitNode> getConstDeclarationUnits() {
        return constDeclarationUnitNodes;
    }

    public void add(ConstDeclarationUnitNode constDeclarationUnitNode) {
        constDeclarationUnitNodes.add(constDeclarationUnitNode);
    }
}
