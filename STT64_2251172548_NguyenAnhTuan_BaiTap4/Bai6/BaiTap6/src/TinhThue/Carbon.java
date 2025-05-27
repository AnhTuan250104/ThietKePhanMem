package TinhThue;

public class Carbon {
    private double price;

    public Carbon(double price) {
        this.price = price;
    }

    // Phương thức tính thuế carbon (10% giá)
    public double Dollar() {
        return 0.1 * price;
    }
}