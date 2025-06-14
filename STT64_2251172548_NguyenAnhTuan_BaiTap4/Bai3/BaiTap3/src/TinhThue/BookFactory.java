package TinhThue;

public class BookFactory extends TaxableItemFactory {
    @Override
    public TaxableItem createItem(double price) {
        return new Book(price);
    }
}