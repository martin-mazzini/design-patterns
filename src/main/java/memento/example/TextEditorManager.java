package memento.example;

import java.util.ArrayList;
import java.util.List;
/** Caretaker  **/
public class TextEditorManager {



    private TextEditor textEditor;
    private List<TextEditorState> previousStates = new ArrayList<>();

    public TextEditorManager(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void save(){
        TextEditorState saved = textEditor.save();
        this.previousStates.add(saved);
    }

    public boolean undo(){
        if (previousStates.isEmpty()){
            System.out.println("No previous state to restore");
            return false;
        }else{
            TextEditorState lastState = previousStates.get(previousStates.size() - 1);
            textEditor.restore(lastState);
            return true;
        }
    }


    public void replaceText(String newText){
        textEditor.replaceText(newText);
    }

    public void appendText(String appendedText){
        textEditor.appendText(appendedText);
    }

    public void clearText(){
        textEditor.clearText();
    }

    public void setFontName(String fontName){
       textEditor.setFontName(fontName);
    }

    public void setFontSize(Integer fontSize){
        textEditor.setFontSize(fontSize);
    }


    public void printState() {
        textEditor.printState();
    }
}
