package command.mine;

/** Receiver */
public class TextFile {

    private String text;

    public TextFile(String text){
        this.text = text;
    }


    public void append(String textToWrite) {
        System.out.println("Text before append: " + text);
        text = text + textToWrite;
        System.out.println("Text after append: " + text);
        System.out.println("-------------------------------");
    }


    public void clear() {
        System.out.println("Text before clear: " + text);
        text = "";
        System.out.println("Text after clear: " + text);
        System.out.println("-------------------------------");
    }

    public void print(){
        System.out.println(text);
    }


}
