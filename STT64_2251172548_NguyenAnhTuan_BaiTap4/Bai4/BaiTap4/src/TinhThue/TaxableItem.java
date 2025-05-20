package TinhThue;

public abstract class TaxableItem {
    protected double price;

    public TaxableItem(double price) {
        this.price = price;
    }

    public abstract double calculateTax();
}