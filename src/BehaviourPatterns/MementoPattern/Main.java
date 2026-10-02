package BehaviourPatterns.MementoPattern;

public class Main {
    public static void main(String[] args) {
        History history = new History();
        TextEditor editor = new TextEditor();

        editor.write("Hello w");
        history.saveState(editor);

        editor.write("Hello E");
        history.saveState(editor);

        history.undo(editor);
        System.out.println(editor.getContent());
    }
}
