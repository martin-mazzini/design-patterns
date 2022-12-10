package builder.mine2;

public class Client {


    /**
     * Taken https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java
     */


    public static void main(String[] args) {

        Book herman_melville = new Book("0-12-345678-9", "Moby-Dick", null, "Herman Melville");


        new BookWithBuilder.Builder("0-12-345678-9", "Moby-dick")
                .description("A book about.....")
                .genre(new Genre());





    }


}
