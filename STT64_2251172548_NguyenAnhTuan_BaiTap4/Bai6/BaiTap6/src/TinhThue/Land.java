package TinhThue;

public class Land {
    private double price;

    public Land(double price) {
        this.price = price;
    }

    // Phương thức tính thuế đất (5% giá)
    public double VND() {
        return 0.05 * price;
    }
}