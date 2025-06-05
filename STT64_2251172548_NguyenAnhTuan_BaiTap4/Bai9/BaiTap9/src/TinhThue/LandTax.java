package TinhThue;

class LandTax implements TaxableItem {
    private double price;

    public LandTax(double price) {
        this.price = price;
    }

    public double CalculateTax() {
        return price * 0.1;
    }
}