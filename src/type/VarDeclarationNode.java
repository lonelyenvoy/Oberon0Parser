package type;

import java.util.List;

public class VarDeclarationNode extends Node {
    public List<VarDeclarationUnitNode> varDeclarationUnitNodes;

    public VarDeclarationNode() {

    }
    public VarDeclarationNode(List<VarDeclarationUnitNode> varDeclarationUnitNodes) {
        this.varDeclarationUnitNodes = varDeclarationUnitNodes;
    }

    public List<VarDeclarationUnitNode> getVarDeclarationUnits() {
        return varDeclarationUnitNodes;
    }

    public void add(VarDeclarationUnitNode varDeclarationUnitNode) {
        varDeclarationUnitNodes.add(varDeclarationUnitNode);
    }
}
