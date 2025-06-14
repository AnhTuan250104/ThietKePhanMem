package TinhThue;

public class Electronics implements TaxableItem {
    private double price;

    public Electronics(double price) {
        this.price = price;
    }

    public double CalculateTax() {
        return price * 0.1; // Ví dụ: thuế 10% cho electronics
    }
}