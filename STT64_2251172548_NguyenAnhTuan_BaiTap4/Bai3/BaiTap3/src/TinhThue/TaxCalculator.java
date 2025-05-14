package TinhThue;

public class TaxCalculator {
    public double CalculateTotalTax(TaxableItem[] items) {
        double totalTax = 0.0;
        for (TaxableItem item : items) {
            totalTax += item.CalculateTax();
        }
        return totalTax;
    }
}