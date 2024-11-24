package solid.liskovsubstitution.bad;

import java.util.ArrayList;

/*
    Liskov Substitution Principle:
    -> The Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with
        objects of a subclass without altering the desirable properties of the program.
    -> Essentially, a subclass should adhere to the behavior and expectations of its superclass.

    Breaks LSP as the JavaCodeEditor can't be safely substituted with PlainTextEditor.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<CodeEditor> codeEditors = new ArrayList<>();
        codeEditors.add(new JavaCodeEditor());
        codeEditors.add(new PlainTextEditor());

        for(CodeEditor editor : codeEditors){
            editor.editCode("int main(){ return 0;}");
        }

        // highlightSyntax on PlainTextEditor throws exception, can't be safely
        // substituted with the CodeEditor (super class),
        // breaks the Liskov Substitution Principle.
        for(CodeEditor editor : codeEditors){
            editor.highlightSyntax("public static void main(){}");
        }
    }
}
