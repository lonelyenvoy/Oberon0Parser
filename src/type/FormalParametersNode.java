package type;

import java.util.List;

public class FormalParametersNode extends Node {
    public List<FormalParameterSectionNode> formalParameterSectionNodes;

    public FormalParametersNode() {

    }
    public FormalParametersNode(List<FormalParameterSectionNode> formalParameterSectionNodes) {
        this.formalParameterSectionNodes = formalParameterSectionNodes;
    }

    public List<FormalParameterSectionNode> getFormalParameterSections() {
        return formalParameterSectionNodes;
    }

    public void add(FormalParameterSectionNode formalParameterSectionNode) {
        formalParameterSectionNodes.add(formalParameterSectionNode);
    }
}
