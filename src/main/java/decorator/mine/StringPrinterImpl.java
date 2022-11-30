package decorator.mine;

import java.io.*;

public class StringPrinterImpl implements StringPrinter {

    @Override
    public void print(String data) {
        System.out.println(data);
    }
}
