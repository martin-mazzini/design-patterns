package decorator.mine;


import decorator.mine.decorators.StringDecorator;
import decorator.mine.decorators.UpperCaseDecorator;
import decorator.mine.decorators.NoWhiteSpaceDecorator;

public class Client {


    public static void main(String[] args) {

        String a = "Decorator is a structural pattern that allows adding new behaviors to objects" +
                " dynamically by placing them inside special wrapper objects, called decorators.";

        StringPrinter printer = new StringPrinterImpl();
        printer.print(a);

        StringDecorator upperCase = new UpperCaseDecorator(printer);
        upperCase.print(a);

        StringDecorator upperCaseAndTrimmed = new UpperCaseDecorator(new NoWhiteSpaceDecorator(printer));
        upperCaseAndTrimmed.print(a);


    }


}
