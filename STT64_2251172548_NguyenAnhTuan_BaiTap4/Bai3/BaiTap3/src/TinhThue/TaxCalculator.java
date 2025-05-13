package TinhThue;

public class TaxCalculator {
    public double calculateTotalTax(TaxableItem[] items) {
        double totalTax = 0.0;
        for (TaxableItem item : items) {
            totalTax += item.calculateTax();
        }
        return totalTax;
    }
}
