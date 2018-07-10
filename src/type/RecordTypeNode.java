package type;

import java.util.List;

public class RecordTypeNode extends TypeNode {
    public List<FieldListNode> fieldListNodes;

    public RecordTypeNode(List<FieldListNode> fieldListNodes) {
        this.fieldListNodes = fieldListNodes;
    }

    public List<FieldListNode> getFieldLists() {
        return fieldListNodes;
    }

    public void add(FieldListNode fieldListNode) {
        fieldListNodes.add(fieldListNode);
    }
}
