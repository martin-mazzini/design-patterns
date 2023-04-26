package memento.example;

public class Client {


    public static void main(String[] args) {


        TextEditorManager textEditorManager = new TextEditorManager(new TextEditor("Design patterns", "Arial", 6));

        textEditorManager.save();
        textEditorManager.appendText(". Elements of Reusable Object-Oriented Software (1994) is a software engineering book describing software design patterns.");
        textEditorManager.printState();
        textEditorManager.undo();
        textEditorManager.printState();

        textEditorManager.setFontName("Calibri");
        textEditorManager.setFontSize(9);
        textEditorManager.save();
        textEditorManager.printState();
        textEditorManager.clearText();
        textEditorManager.printState();
        textEditorManager.undo();
        textEditorManager.printState();

    }


}
