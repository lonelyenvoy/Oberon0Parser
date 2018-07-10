package exception.parser;

public abstract class ParserException extends Exception {
    public ParserException() {}
    public ParserException(String message) {
        super(message);
    }
}
