package type;

import type.base.Node;
import type.base.NodeDequeContainer;

import java.util.ArrayDeque;
import java.util.Deque;

public class FormalParametersNode extends Node implements NodeDequeContainer<FormalParameterSectionNode> {
    public final Deque<FormalParameterSectionNode> formalParameterSectionNodes;

    public FormalParametersNode() {
        this.formalParameterSectionNodes = new ArrayDeque<>();
    }
    public FormalParametersNode(Deque<FormalParameterSectionNode> formalParameterSectionNodes) {
        if (formalParameterSectionNodes == null) {
            throw new IllegalArgumentException("formalParameterSectionNodes cannot be null");
        }
        this.formalParameterSectionNodes = formalParameterSectionNodes;
    }

    @Override
    public void addFirst(FormalParameterSectionNode formalParameterSectionNode) {
        if (formalParameterSectionNode == null) {
            throw new IllegalArgumentException("formalParameterSectionNode cannot be null");
        }
        formalParameterSectionNodes.addFirst(formalParameterSectionNode);
    }

    @Override
    public FormalParameterSectionNode getFirst() {
        return formalParameterSectionNodes.getFirst();
    }

    @Override
    public Deque<FormalParameterSectionNode> getContainer() {
        return formalParameterSectionNodes;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        boolean first = true;
        for (FormalParameterSectionNode node : formalParameterSectionNodes) {
            if (first) first = false;
            else builder.append("; ");
            builder.append(node.toString());
        }
        builder.append(")");
        return builder.toString();
    }
}
