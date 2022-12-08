package decorator.mine;

import java.io.*;
/** Concrete component */
public class StringPrinterImpl implements StringPrinter {

    @Override
    public void print(String data) {

        System.out.println(data);
    }
}
