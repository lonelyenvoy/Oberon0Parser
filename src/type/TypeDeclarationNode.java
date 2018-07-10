package type;

import java.util.List;

public class TypeDeclarationNode extends Node {
    public List<TypeDeclarationUnitNode> typeDeclarationUnitNodes;

    public TypeDeclarationNode() {

    }
    public TypeDeclarationNode(List<TypeDeclarationUnitNode> typeDeclarationUnitNodes) {
        this.typeDeclarationUnitNodes = typeDeclarationUnitNodes;
    }

    public List<TypeDeclarationUnitNode> getTypeDeclarationUnits() {
        return typeDeclarationUnitNodes;
    }

    public void add(TypeDeclarationUnitNode typeDeclarationUnitNode) {
        typeDeclarationUnitNodes.add(typeDeclarationUnitNode);
    }
}
