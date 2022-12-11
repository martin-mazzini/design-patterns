package strategy.comparator;

import java.util.Comparator;

public class CompareLastCharachter implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        char lastCharachterOfA = a.charAt(a.length() - 1);
        char lastCharachterOfB = b.charAt(b.length() - 1);
        return Character.compare(lastCharachterOfA, lastCharachterOfB);

    }


}
