package TinhThue;

interface TaxableItem {
    double getTaxRate();
    double calculateTax();
    double applyDeductions();
}
