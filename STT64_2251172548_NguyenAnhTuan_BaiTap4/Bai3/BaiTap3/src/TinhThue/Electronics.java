package TinhThue;

public class Electronics extends TaxableItemImpl {
    public Electronics(double price) {
        super(price);
    }

    @Override
    public double CalculateTax() {
        return price * 0.1;
    }
}