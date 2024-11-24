package solid.liskovsubstitution.good;

public class PythonCodeEditor extends CodeEditor {
    @Override
    public void highlightSyntax(String code) {
        System.out.println("Highlight Syntax in PythonCodeEditor: " + code);
    }

    @Override
    public void editCode(String code) {
        System.out.println("Editing Code in PythonCodeEditor: " + code);
    }
}
