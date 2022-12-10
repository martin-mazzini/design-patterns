package observer.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client {


    /**
     * The Java Swing library includes a number of classes that implement the Observer pattern,
     * using the java.util.EventListener interface as the base for all event listener interfaces.
     * This interface defines the methods that must be implemented by any object that wants to
     * receive notifications of events, such as mouse clicks or keyboard input.
     *
     * Here is an example of how the Observer pattern is used in the Java Swing library
     * to handle mouse clicks on a button:
     * @param args
     *
     *
     * In this example, the ActionListener interface extends the EventListener interface, and defines a single method called actionPerformed() that is called whenever an action event (such as a mouse click) occurs on the button. The addActionListener() method is called on the button to attach an instance of the ActionListener interface to the button, and the actionPerformed() method is implemented to handle the event.
     *
     * The ActionListener interface and the addActionListener() method are examples of the Observer pattern in the Java Swing library. The ActionListener interface defines a contract for objects that want to be notified of action events, and the addActionListener() method is used to attach these objects to the button. When the button is clicked, it automatically notifies all of its attached listeners by calling their actionPerformed() methods.
     */

    public static void main(String[] args) {
        // Create a button.
        JButton button = new JButton("Click me!");

        /** Action listener hereda de EventListener.
         * Es el equivalente a Observer.
         * Tiene un metodo que se llama actionPerformed que es el equivalente a update
         * Le pasa el evento al actionPerformed para que haga lo que quiera con el mismo */
        // Add an action listener to the button.
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the action event (in this case, a mouse click on the button).
                System.out.println("Button clicked!");
            }
        });

        // Show the button in a window.
        JFrame frame = new JFrame();
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
