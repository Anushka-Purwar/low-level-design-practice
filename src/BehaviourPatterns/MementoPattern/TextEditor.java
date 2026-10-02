package BehaviourPatterns.MementoPattern;

public class TextEditor {
    private String content;

    public void write(String content){
        this.content = content;
    }

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    // memento -> will update state from there
    public void restore(EditorMemento memento){
        content = memento.getContent();
    }
    public String getContent(){
        return content;
    }
}
