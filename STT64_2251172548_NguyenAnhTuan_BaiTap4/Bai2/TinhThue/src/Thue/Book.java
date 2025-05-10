package Thue;

public class Book implements TaxableItem {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return 0.05 * price;
    }

    public double getPrice() {
        return price;
    }
}