package type;

import type.base.NodeDequeContainer;

import java.util.Deque;

public class RecordTypeNode extends TypeNode implements NodeDequeContainer<FieldListNode> {
    public final Deque<FieldListNode> fieldListNodes;

    public RecordTypeNode(Deque<FieldListNode> fieldListNodes) {
        if (fieldListNodes == null) {
            throw new IllegalArgumentException("fieldListNodes cannot be null");
        }
        this.fieldListNodes = fieldListNodes;
    }

    @Override
    public void addFirst(FieldListNode fieldListNode) {
        if (fieldListNode == null) {
            throw new IllegalArgumentException("fieldListNode cannot be null");
        }
        fieldListNodes.addFirst(fieldListNode);
    }

    @Override
    public FieldListNode getFirst() {
        return fieldListNodes.getFirst();
    }

    @Override
    public Deque<FieldListNode> getContainer() {
        return fieldListNodes;
    }
}
