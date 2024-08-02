package org.example.catalogue;

public class Book extends Catalog {
    private String author;
    private String genre;

    public Book(String isbn, String title, int publicationYear, int pageCount, String author, String genre) {
        super(isbn, title, publicationYear, pageCount);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
