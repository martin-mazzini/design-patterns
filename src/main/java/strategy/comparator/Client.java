package strategy.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client {


    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Samantha");
        names.add("Michael");
        names.add("David");
        names.add("Emily");
        names.add("Sue");
        names.add("Max");
        names.add("Michaelangelo");
        names.add("Christopher");


        //default
        Collections.sort(names);
        System.out.println(names);


        Collections.sort(names, new CompareLength());
        System.out.println(names);


        Collections.sort(names, new CompareLastCharachter());
        System.out.println(names);




        //modern java
        Collections.sort(names, (a,b) -> Integer.compare(a.length(), b.length()));
        System.out.println(names);

        Collections.sort(names, Comparator.comparingInt(String::length));
        System.out.println(names);


    }


}
