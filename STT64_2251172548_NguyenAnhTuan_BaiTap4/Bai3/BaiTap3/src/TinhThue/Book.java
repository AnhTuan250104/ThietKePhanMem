package TinhThue;

public class Book implements TaxableItem {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    public double CalculateTax() {
        return price * 0.05; // Ví dụ: thuế 5% cho sách
    }
}