package solid.liskovsubstitution.good;

public class PlainTextEditor extends TextEditor {
    @Override
    public void editCode(String code) {
        System.out.println("Editing code in PlainTextEditor" + code);
    }
}
