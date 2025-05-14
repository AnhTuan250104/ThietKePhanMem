package TinhThue;

public class BookFactory {
    public TaxableItem createItem(double price) {
        return new Book(price);
    }
}