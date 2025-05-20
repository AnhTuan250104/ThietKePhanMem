package TinhThue;

public class ImportDutyTax extends TaxableItem {
    public ImportDutyTax(double price) {
        super(price);
    }

    @Override
    public double calculateTax() {
        return price * 0.10; 
    }
}