package type;

public class IdentifierNode extends TerminalNode {
    public final String identifier;

    public IdentifierNode(String identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException("identifier cannot be null");
        }
        this.identifier = identifier;
    }
}
