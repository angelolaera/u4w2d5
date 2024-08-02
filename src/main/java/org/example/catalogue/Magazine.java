package org.example.catalogue;

public class Magazine extends Catalog {
    private Frequency frequency;

    public Magazine(String isbn, String title, int publicationYear, int pageCount, Frequency frequency) {
        super(isbn, title, publicationYear, pageCount);
        this.frequency = frequency;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "frequency=" + frequency +
                "} " + super.toString();
    }

    public enum Frequency {
        WEEKLY,
        MONTHLY,
        SEMIANNUAL
    }
}
