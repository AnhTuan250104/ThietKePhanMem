package TinhThue;

class CarbonTax implements TaxableItem {
    private double price;

    public CarbonTax(double price) {
        this.price = price;
    }

    public double CalculateTax() {
        return price * 0.05; 
    }
}