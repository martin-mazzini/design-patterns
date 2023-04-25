package decorator.live;

/** Concrete component */
public class StringPrinter implements Printer  {

    public void print(String data) {
        System.out.println(data);
    }

}
