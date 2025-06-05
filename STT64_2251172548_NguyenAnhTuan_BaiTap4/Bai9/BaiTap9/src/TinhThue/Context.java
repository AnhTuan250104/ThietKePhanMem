package TinhThue;

class Context {
    private TaxableItem taxableItem;

    public void setTaxableItem(TaxableItem taxableItem) {
        this.taxableItem = taxableItem;
    }

    public double Calculate() {
        if (taxableItem != null) {
            return taxableItem.CalculateTax();
        }
        return 0.0;
    }
}