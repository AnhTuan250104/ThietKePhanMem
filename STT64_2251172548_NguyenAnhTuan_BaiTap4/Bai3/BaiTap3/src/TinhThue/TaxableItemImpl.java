package TinhThue;

public abstract class TaxableItemImpl extends TaxableItem {
    protected double price;

    public TaxableItemImpl(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}