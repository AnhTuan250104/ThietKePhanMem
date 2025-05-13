package TinhThue;

public class ElectronicsFactory implements ItemFactory {
    @Override
    public TaxableItem createItem(double price) {
        return new Electronics(price);
    }
}