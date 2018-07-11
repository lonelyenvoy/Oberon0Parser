package exception.analyzer;

public class DuplicatedDeclarationException extends AnalyzerException {
    public DuplicatedDeclarationException() {}
    public DuplicatedDeclarationException(String message) { super(message); }
}
