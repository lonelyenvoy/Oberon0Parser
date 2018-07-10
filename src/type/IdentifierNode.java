package type;

public class IdentifierNode extends TerminalNode {
    public String identifier;

    public IdentifierNode(String identifier) {
        this.identifier = identifier;
    }
}
