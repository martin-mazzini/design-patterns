package builder.lombok;

import builder.mine2.BookWithBuilder;
import builder.mine2.Genre;

public class Client {

    public static void main(String[] args) {

        Book aaa = Book.builder()
                .description("aaa")
                .genre(new Genre())
                .build();

    }
}
