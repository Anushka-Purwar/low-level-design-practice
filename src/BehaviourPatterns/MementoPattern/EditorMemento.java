package BehaviourPatterns.MementoPattern;

public class EditorMemento extends History{
    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }
    public String getContent(){
        return content;
    }
}
