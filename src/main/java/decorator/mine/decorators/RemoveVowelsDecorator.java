package decorator.mine.decorators;

import decorator.mine.StringPrinter;

public class RemoveVowelsDecorator extends StringDecorator{


    RemoveVowelsDecorator(StringPrinter source) {
        super(source);
    }

    @Override
    public void print(String str) {
        String s = str.replaceAll("[aeiouAEIOU]", "");
        super.print(s);
    }


    /**
     *
     * public static String truncateString(String str, int n) {
     *     if (str.length() > n) {
     *         str = str.substring(0, n);
     *     }
     *     return str;
     * }
     *
     *
     *
     */


}
