package decorator.mine.decorators;

import decorator.mine.StringPrinter;

/**
 * Base decorator
 */
public abstract class StringDecorator implements StringPrinter {

    private StringPrinter wrappee;

    StringDecorator(StringPrinter source) {
        this.wrappee = source;
    }

    @Override
    public void print(String data) {
        wrappee.print(data);
    }

}
