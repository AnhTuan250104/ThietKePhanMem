package TinhThue;

public class Electronics implements TaxableItem {
    private double price;

    public Electronics(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return 0.1 * price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
