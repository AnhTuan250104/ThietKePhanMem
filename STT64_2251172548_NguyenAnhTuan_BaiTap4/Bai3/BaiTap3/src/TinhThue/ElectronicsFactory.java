package TinhThue;

public class ElectronicsFactory extends TaxableItemFactory {
    @Override
    public TaxableItem createItem(double price) {
        return new Electronics(price);
    }
}