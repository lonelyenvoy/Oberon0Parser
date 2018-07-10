package type;

import type.base.Node;
import type.base.NodeDequeContainer;

import java.util.ArrayDeque;
import java.util.Deque;

public class VarDeclarationNode extends Node implements NodeDequeContainer<VarDeclarationUnitNode> {
    public final Deque<VarDeclarationUnitNode> varDeclarationUnitNodes;

    public VarDeclarationNode() {
        this.varDeclarationUnitNodes = new ArrayDeque<>();
    }
    public VarDeclarationNode(Deque<VarDeclarationUnitNode> varDeclarationUnitNodes) {
        if (varDeclarationUnitNodes == null) {
            throw new IllegalArgumentException("varDeclarationUnitNodes cannot be null");
        }
        this.varDeclarationUnitNodes = varDeclarationUnitNodes;
    }

    @Override
    public void addFirst(VarDeclarationUnitNode varDeclarationUnitNode) {
        if (varDeclarationUnitNode == null) {
            throw new IllegalArgumentException("varDeclarationUnitNode cannot be null");
        }
        varDeclarationUnitNodes.addFirst(varDeclarationUnitNode);
    }

    @Override
    public VarDeclarationUnitNode getFirst() {
        return varDeclarationUnitNodes.getFirst();
    }

    @Override
    public Deque<VarDeclarationUnitNode> getContainer() {
        return varDeclarationUnitNodes;
    }
}
