package BTVN;

import java.time.LocalDate;

public class Science extends Book{
    private String category;


    public Science(String name, double price, int quantity, LocalDate publicationDate, String category){
        super(name, price, quantity, publicationDate);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ScienceBook { name=" + getName() +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", publicationDate=" + getPublicationDate() +
                ", category=" + category + "}";
    }
}
