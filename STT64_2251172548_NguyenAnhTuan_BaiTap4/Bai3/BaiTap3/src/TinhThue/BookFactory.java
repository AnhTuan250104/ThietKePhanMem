package TinhThue;

public class BookFactory implements ItemFactory {
    @Override
    public TaxableItem createItem(double price) {
        return new Book(price);
    }
}
