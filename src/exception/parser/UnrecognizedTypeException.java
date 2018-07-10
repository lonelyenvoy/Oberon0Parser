package exception.parser;

public class UnrecognizedTypeException extends TypeException {
    public UnrecognizedTypeException() {}
    public UnrecognizedTypeException(String message) {
        super(message);
    }
}
