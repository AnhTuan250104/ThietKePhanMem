package TinhThue;

public class CarbonTax extends TaxableItem {
    public CarbonTax(double price) {
        super(price);
    }

    @Override
    public double calculateTax() {
        return price * 0.10; 
    }
}