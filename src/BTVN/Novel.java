package BTVN;


import java.time.LocalDate;

public class Novel extends Book {
    private String author;


    public Novel(String name, double price, int quantity, LocalDate publicationDate, String author) {
        super(name, price, quantity, publicationDate);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Novel{ name=" + getName() +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", publicationDate=" + getPublicationDate() +
                ", author=" + author + "}";

    }
}
