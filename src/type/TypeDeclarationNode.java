package type;

import type.base.NodeDequeContainer;

import java.util.ArrayDeque;
import java.util.Deque;

public class TypeDeclarationNode extends Node implements NodeDequeContainer<TypeDeclarationUnitNode> {
    public final Deque<TypeDeclarationUnitNode> typeDeclarationUnitNodes;

    public TypeDeclarationNode() {
        this.typeDeclarationUnitNodes = new ArrayDeque<>();
    }
    public TypeDeclarationNode(Deque<TypeDeclarationUnitNode> typeDeclarationUnitNodes) {
        if (typeDeclarationUnitNodes == null) {
            throw new IllegalArgumentException("typeDeclarationUnitNodes cannot be null");
        }
        this.typeDeclarationUnitNodes = typeDeclarationUnitNodes;
    }

    @Override
    public void addFirst(TypeDeclarationUnitNode typeDeclarationUnitNode) {
        if (typeDeclarationUnitNode == null) {
            throw new IllegalArgumentException("typeDeclarationUnitNode cannot be null");
        }
        typeDeclarationUnitNodes.addFirst(typeDeclarationUnitNode);
    }

    @Override
    public TypeDeclarationUnitNode getFirst() {
        return typeDeclarationUnitNodes.getFirst();
    }

    @Override
    public Deque<TypeDeclarationUnitNode> getContainer() {
        return typeDeclarationUnitNodes;
    }
}
