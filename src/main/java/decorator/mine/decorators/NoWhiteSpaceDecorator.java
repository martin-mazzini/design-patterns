package decorator.mine.decorators;


import decorator.mine.StringPrinter;
import decorator.mine.StringPrinterImpl;

public class NoWhiteSpaceDecorator extends StringDecorator {

    public NoWhiteSpaceDecorator(StringPrinter source) {
        super(source);
    }

    @Override
    public void print(String data) {
        String trimmed = data.replaceAll("\\s+","");
        super.print(trimmed);

    }




}
