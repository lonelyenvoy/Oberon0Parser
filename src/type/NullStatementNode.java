package type;

public class NullStatementNode extends StatementNode {
    @Override
    public String toString() {
        return "";
    }

    @Override
    public String toNormativeString() {
        return toString();
    }
}
