package TinhThue;

public class Book extends TaxableItemImpl {
    public Book(double price) {
        super(price);
    }

    @Override
    public double CalculateTax() {
        return price * 0.05; 
    }
}