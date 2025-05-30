package TinhThue;

class TaxCalculator {
    private TaxableItem taxableItem;

    public TaxCalculator(TaxableItem taxableItem) {
        this.taxableItem = taxableItem;
    }

    public double getTaxRate() {
        return taxableItem.getTaxRate();
    }

    public double calculateTax() {
        return taxableItem.calculateTax();
    }

    public double applyDeductions() {
        return taxableItem.applyDeductions();
    }

    public void setTaxableItem(TaxableItem taxableItem) {
        this.taxableItem = taxableItem;
    }
}