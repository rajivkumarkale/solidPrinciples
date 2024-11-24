package solid.liskovsubstitution.bad;

// Base Class: codeEditor
public abstract class CodeEditor {
    public abstract void highlightSyntax(String code);
    public abstract void editCode(String code);
}
