package decorator.mine.decorators;

import decorator.mine.StringPrinter;

/**
 * Concrete Decorator
 */
public class UpperCaseDecorator extends StringDecorator {


    public UpperCaseDecorator(StringPrinter source) {
        super(source);
    }

    @Override
    public void print(String data) {
        String upperCase = data.toUpperCase();
        super.print(upperCase);

    }


}
