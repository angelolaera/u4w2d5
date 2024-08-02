package org.example.catalogue;

public abstract class Catalog{
    private String isbn;
    private String title;
    private int publicationYear;
    private int pageCount;

    public Catalog(String isbn, String title, int publicationYear, int pageCount) {
        this.isbn = isbn;
        this.title = title;
        this.publicationYear = publicationYear;
        this.pageCount = pageCount;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "CatalogItem{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", pageCount=" + pageCount +
                '}';
    }
}
