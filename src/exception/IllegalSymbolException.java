package exception;

public class IllegalSymbolException extends LexerException {
    public IllegalSymbolException() {}
    public IllegalSymbolException(String message) {
        super(message);
    }
}
