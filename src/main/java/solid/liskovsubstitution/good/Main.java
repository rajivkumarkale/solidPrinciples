package solid.liskovsubstitution.good;

import java.util.ArrayList;

/*
    Liskov Substitution Principle
    It states that
        Every subclass or derived class should be substitutable for their base or parent class.

    =========
    By separating the TextEditor into its own hierarchy (TextEditor),
    the design avoids forcing unrelated functionality.

    This ensures that both hierarchies adhere to LSP, allowing appropriate substitutions in their respective contexts.
 */
public class Main {
    public static void main(String[] args){
        ArrayList<CodeEditor> codeEditors = new ArrayList<>();
        codeEditors.add(new JavaCodeEditor());
        codeEditors.add(new PythonCodeEditor());

        for(CodeEditor editor : codeEditors){
            editor.highlightSyntax("int main(){ return 0;}");
        }

        ArrayList<TextEditor> textEditors = new ArrayList<>();
        textEditors.add(new JavaCodeEditor());
        textEditors.add(new PythonCodeEditor());
        textEditors.add(new PlainTextEditor());

        // works properly as all of them supports editCode functionality
        for(TextEditor editor : textEditors) {
            editor.editCode("int main(){ return 0;}");

            // TextEditor Interface doesn't support highlightSyntax so
            // this method can't be called.
            //editor.highlightSyntax("int main(){ return 0;}");
        }
    }
}
