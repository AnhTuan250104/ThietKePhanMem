package TinhThue;

public class TaxableItemFactory {
    public TaxableItem createItem(double price) {
        return new TaxableItemImpl(price) {
            @Override
            public double CalculateTax() {
                return 0.0;
            }
        };
    }
}