package decorator.mine.decorators;

import decorator.mine.StringPrinter;

public class StringUppercaseDecorator extends StringDecorator {


    public StringUppercaseDecorator(StringPrinter source) {
        super(source);
    }

    @Override
    public void print(String data) {
        String upperCase = data.toUpperCase();
        super.print(upperCase);

    }


}
