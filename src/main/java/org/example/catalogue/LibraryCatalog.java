package org.example.catalogue;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private List<Catalog> catalog;

    public LibraryCatalog() {
        this.catalog = new ArrayList<>();
    }

    public void addItem(CatalogItem item) {
        catalog.add(item);
    }

    public void removeItem(String isbn) {
        catalog.removeIf(item -> item.getIsbn().equals(isbn));
    }

    public Catalog searchByIsbn(String isbn) {
        return catalog.stream()
                .filter(item -> item.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }

    public List<Catalog> searchByYear(int publicationYear) {
        List<Catalog> results = new ArrayList<>();
        for (Catalog item : catalog) {
            if (item.getPublicationYear() == publicationYear) {
                results.add(item);
            }
        }
        return results;
    }

    public List<Catalog> searchByAuthor(String author) {
        List<Catalog> results = new ArrayList<>();
        for (Catalog item : catalog) {
            if (item instanceof Book && ((Book) item).getAuthor().equals(author)) {
                results.add(item);
            }
        }
        return results;
    }

    @Override
    public String toString() {
        return "LibraryCatalog{" +
                "catalog=" + catalog +
                '}';
    }
}
