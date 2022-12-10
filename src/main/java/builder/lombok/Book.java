package builder.lombok;

import builder.mine2.Genre;
import lombok.Builder;

import java.time.Year;
@Builder
public class Book {

    private final String isbn;
    private final String title;
    private final Genre genre;
    private final String author;
    private final Year published;
    private final String description;



}
