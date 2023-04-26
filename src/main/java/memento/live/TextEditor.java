package memento.live;

import memento.example.TextEditorState;

public class TextEditor {


    private String text;
    private String fontName;
    private Integer fontSize;

    public TextEditor(String text, String fontName, Integer fontSize) {
        this.text = text;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public void replaceText(String newText){
        text = newText;
    }

    public void appendText(String appendedText){
        text = text + appendedText;
    }

    public void clearText(){
        text = "";
    }

    public void setFontName(String fontName){
        this.fontName = fontName;
    }

    public void setFontSize(Integer fontSize){
        this.fontSize = fontSize;
    }


    public void save(){

    }

    public void restore(){

    }


    public void printState() {
        System.out.println("Text: " + text + ". Font size: " + fontSize + ". Font name: " + fontName);
    }
}
