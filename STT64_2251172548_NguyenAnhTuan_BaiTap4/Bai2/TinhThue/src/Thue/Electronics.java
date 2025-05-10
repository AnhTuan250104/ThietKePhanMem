package Thue;

public class Electronics implements TaxableItem {
    private double price;

    public Electronics(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return 0.1 * price;
    }

    public double getPrice() {
        return price;
    }
}