package memento.live;

import memento.example.TextEditor;

public class Client {

    public static void main(String[] args) {


        TextEditor textEditor = new TextEditor("Design Patterns: Elements of Reusable Object-Oriented Software (1994)", "Arial", 6);
        textEditor.appendText("is a software engineering book");
        textEditor.appendText("describing software design patterns");
        //GUARDAR EL ESTADO DEL TEXT EDITOR

    }
}
