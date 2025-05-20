package TinhThue;

public class TaxCalculator {
    private ITaxPolicyFactory factory;

    public TaxCalculator(ITaxPolicyFactory factory) {
        this.factory = factory;
    }

    public double calculateTotalTax(double[] prices) {
        double totalTax = 0;
        for (double price : prices) {
            TaxableItem item = factory.createLandTax(price); 
            totalTax += item.calculateTax();
        }
        return totalTax;
    }

    public static void main(String[] args) {
        ITaxPolicyFactory standardFactory = new StandardPolicyTaxFactory();
        TaxCalculator calc = new TaxCalculator(standardFactory);
        double[] prices = {100.0, 200.0, 300.0};
        double total = calc.calculateTotalTax(prices);
        System.out.println("Tổng thuế: " + total);

        ITaxPolicyFactory specialFactory = new SpecialGoodsTaxFactory();
        TaxCalculator calcSpecial = new TaxCalculator(specialFactory);
        double totalSpecial = calcSpecial.calculateTotalTax(prices);
        System.out.println("Tổng thuế (Special): " + totalSpecial);
    }
}