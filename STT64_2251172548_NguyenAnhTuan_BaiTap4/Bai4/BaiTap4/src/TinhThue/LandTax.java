package TinhThue;

public class LandTax extends TaxableItem {
    public LandTax(double price) {
        super(price);
    }

    @Override
    public double calculateTax() {
        return price * 0.05;
    }
}