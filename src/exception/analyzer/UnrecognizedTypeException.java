package exception.analyzer;

public class UnrecognizedTypeException extends AnalyzerException {
    public UnrecognizedTypeException() {}
    public UnrecognizedTypeException(String message) {
        super(message);
    }
}
