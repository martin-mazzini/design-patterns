package builder.live;

import builder.mine2.Genre;

import java.time.Year;

public class Book {

    private String isbn; //OBLIGATORIO
    private String title; //OBLIGATORIO
    private Genero genre;
    private String author;
    private Year published;
    private String description;

    //Quiero poder setear o no cada uno de los parametros.
    //SI creo un constructor para cada una de las combinacines, tengo que hacer 100 constructores.
    //Si creo un solo constructor que acepte todo, entonces tengo que mandar null para lo que no me interesa
    //Si el constructor tiene el mismo tipo, es posible confundirse los parametros al pasar
    //No podemos crear dos constructores con la misma firma


    //Quiero prover una API amigable para construir libros que resuelva estos problemas
    //Amigable = no confundirme de parametros, no tener que pasar NULL innecesariamente
    //Ademas quiero que la API distinga entre parametros obligatorios y opcionales
    //No quiero teneer que construir un objeto Genero, quiero pasar un String y que se construya
    //Estaria bueno aprovechar el autocomplete del IDE para ver que opciones tengo


    private Book(BookBuilder bookBuilder) {
        this.isbn = bookBuilder.isbn;
        this.title = bookBuilder.title;
        this.genre = bookBuilder.genre;
        this.author = bookBuilder.author;
        this.published =  bookBuilder.published;
        this.description = bookBuilder.description;
    }

    public static class BookBuilder {
        private String isbn;
        private String title;
        private Genero genre;
        private String author;
        private Year published;
        private String description;

        //CONSTRUCTOR DEL BOOK BUILDER
        public BookBuilder(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }

        //Por que hago que esto devuelva un book builder?
        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder published(Year year) {
            this.published = year;
            return this;
        }

        public BookBuilder description(String description){
            this.description = description;
            return this;
        }

        public BookBuilder genre(String genre){
            Genero genero = new Genero(genre);
            this.genre = genero;
            return this;
        }

        public Book build(){
            return new Book(this);
        }







    }


    public void setAuthor(){

    }





}
