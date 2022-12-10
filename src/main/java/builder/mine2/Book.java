package builder.mine2;

import java.time.Year;

public class Book {

    private final String isbn;
    private final String title;
    private final Genre genre;
    private final String author;
    private final Year published;
    private final String description;





    public Book(String isbn, String title) {
        this(isbn, title, null);
    }

    public Book(String isbn, String title, Genre genre) {
        this(isbn, title, genre, null);
    }

    public Book(String isbn, String title, Genre genre, String author) {
        this(isbn, title, genre, author, null);
    }

    public Book(String isbn, String title, Genre genre, String author, Year published) {
        this(isbn, title, genre, author, published, null);
    }



    public Book(String isbn, String title, Genre genre, String author, Year published, String description) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.published = published;
        this.description = description;
    }



    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public Year getPublished() {
        return published;
    }

    public String getDescription() {
        return description;
    }




}
