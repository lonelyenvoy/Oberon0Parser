package exception.parser;

public class ElementMissingException extends ParserException {
    public ElementMissingException() {}
    public ElementMissingException(String message) { super(message); }
}
