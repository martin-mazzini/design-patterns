package memento;

/** MEMENTO  **/
public class TextEditorState {

    private String text;
    private String fontName;
    private Integer fontSize;

    public TextEditorState(String text, String fontName, Integer fontSize) {
        this.text = text;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }


    public String getText() {
        return text;
    }

    public String getFontName() {
        return fontName;
    }

    public Integer getFontSize() {
        return fontSize;
    }
}
