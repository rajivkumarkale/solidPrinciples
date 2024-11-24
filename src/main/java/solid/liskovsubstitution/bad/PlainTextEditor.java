package solid.liskovsubstitution.bad;

public class PlainTextEditor extends CodeEditor {
    @Override
    public void highlightSyntax(String code) {
        throw new UnsupportedOperationException("Plain Text Editor doesn't support code syntax highlighting.");
    }

    @Override
    public void editCode(String code) {
        System.out.println("Plain Text Editor editing code: " + code);
    }
}
