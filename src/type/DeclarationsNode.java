package type;

import java.util.List;

public class DeclarationsNode extends Node {
    public ConstDeclarationNode constDeclarationNode;
    public TypeDeclarationNode typeDeclarationNode;
    public VarDeclarationNode varDeclarationNode;
    public List<ProcedureDeclarationNode> procedureDeclarationNodes;

    public DeclarationsNode(ConstDeclarationNode constDeclarationNode,
                            TypeDeclarationNode typeDeclarationNode,
                            VarDeclarationNode varDeclarationNode,
                            List<ProcedureDeclarationNode> procedureDeclarationNodes) {
        this.constDeclarationNode = constDeclarationNode;
        this.typeDeclarationNode = typeDeclarationNode;
        this.varDeclarationNode = varDeclarationNode;
        this.procedureDeclarationNodes = procedureDeclarationNodes;
    }
}
