package TinhThue;

public class ElectronicsFactory {
    public TaxableItem createItem(double price) {
        return new Electronics(price);
    }
}