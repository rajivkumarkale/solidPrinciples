package solid.liskovsubstitution.bad;

public class JavaCodeEditor extends CodeEditor {
    @Override
    public void highlightSyntax(String code) {
        System.out.println("Highlight Syntax in JavaCodeEditor : " + code);
    }

    @Override
    public void editCode(String code) {
        System.out.println("Edited Code in JavaCodeEditor: " + code);
    }
}
