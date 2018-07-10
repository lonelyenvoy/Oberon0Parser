package type;

import type.base.NodeDequeContainer;

import java.util.Deque;

public class DeclarationsNode extends Node {
    public final ConstDeclarationNode constDeclarationNode;
    public final TypeDeclarationNode typeDeclarationNode;
    public final VarDeclarationNode varDeclarationNode;
    public final Deque<ProcedureDeclarationNode> procedureDeclarationNodes;

    public DeclarationsNode(ConstDeclarationNode constDeclarationNode,
                            TypeDeclarationNode typeDeclarationNode,
                            VarDeclarationNode varDeclarationNode,
                            Deque<ProcedureDeclarationNode> procedureDeclarationNodes) {
        if (constDeclarationNode == null) {
            throw new IllegalArgumentException("constDeclarationNode cannot be null");
        }
        if (typeDeclarationNode == null) {
            throw new IllegalArgumentException("typeDeclarationNode cannot be null");
        }
        if (varDeclarationNode == null) {
            throw new IllegalArgumentException("varDeclarationNode cannot be null");
        }
        if (procedureDeclarationNodes == null) {
            throw new IllegalArgumentException("procedureDeclarationNodes cannot be null");
        }
        this.constDeclarationNode = constDeclarationNode;
        this.typeDeclarationNode = typeDeclarationNode;
        this.varDeclarationNode = varDeclarationNode;
        this.procedureDeclarationNodes = procedureDeclarationNodes;
    }
}
