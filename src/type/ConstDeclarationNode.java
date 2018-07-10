package type;

import type.base.Node;
import type.base.NodeDequeContainer;

import java.util.ArrayDeque;
import java.util.Deque;

public class ConstDeclarationNode extends Node implements NodeDequeContainer<ConstDeclarationUnitNode> {
    public final Deque<ConstDeclarationUnitNode> constDeclarationUnitNodes;

    public ConstDeclarationNode() {
        this.constDeclarationUnitNodes = new ArrayDeque<>();
    }
    public ConstDeclarationNode(Deque<ConstDeclarationUnitNode> constDeclarationUnitNodes) {
        if (constDeclarationUnitNodes == null) {
            throw new IllegalArgumentException("constDeclarationUnitNodes cannot be null");
        }
        this.constDeclarationUnitNodes = constDeclarationUnitNodes;
    }

    @Override
    public Deque<ConstDeclarationUnitNode> getContainer() {
        return constDeclarationUnitNodes;
    }

    @Override
    public void addFirst(ConstDeclarationUnitNode constDeclarationUnitNode) {
        if (constDeclarationUnitNode == null) {
            throw new IllegalArgumentException("constDeclarationUnitNode cannot be null");
        }
        constDeclarationUnitNodes.addFirst(constDeclarationUnitNode);
    }

    @Override
    public ConstDeclarationUnitNode getFirst() {
        return constDeclarationUnitNodes.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (!constDeclarationUnitNodes.isEmpty()) {
            builder.append("CONST ");
            for (ConstDeclarationUnitNode node : constDeclarationUnitNodes) {
                builder.append(node.toString());
            }
        }
        return builder.toString();
    }
}
