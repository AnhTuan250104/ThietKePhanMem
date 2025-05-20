package TinhThue;

public class ConsumptionTax extends TaxableItem {
    public ConsumptionTax(double price) {
        super(price);
    }

    @Override
    public double calculateTax() {
        return price * 0.05; 
    }
}
