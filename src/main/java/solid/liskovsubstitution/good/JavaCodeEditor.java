package solid.liskovsubstitution.good;

public class JavaCodeEditor extends CodeEditor {
    @Override
    public void highlightSyntax(String code) {
        System.out.println("Highlight Syntax for: " + code);
    }

    @Override
    public void editCode(String code) {
        System.out.println("Editing Code in JavaCodeEditor: " + code);
    }
}
