package exception.parser;

public class InconsistentIdentifierException extends ParserException {
    public InconsistentIdentifierException() {}
    public InconsistentIdentifierException(String message) { super(message); }
}
