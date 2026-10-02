package BehaviourPatterns.MementoPattern;

import org.w3c.dom.Text;

import java.util.Stack;

public class History {
    Stack<EditorMemento> st = new Stack<>();
    public void saveState(TextEditor editor){
        st.push(editor.save());
    }

    public void undo(TextEditor editor){
        if(!st.isEmpty()){
            st.pop();
            editor.restore(st.peek());
        }
    }
}
