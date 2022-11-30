package decorator.mine.decorators;


import decorator.mine.StringPrinter;
import decorator.mine.StringPrinterImpl;

public class StringTrimmedDecorator extends StringDecorator {

    public StringTrimmedDecorator(StringPrinter source) {
        super(source);
    }

    @Override
    public void print(String data) {
        String trimmed = data.trim();
        super.print(trimmed);

    }




}
