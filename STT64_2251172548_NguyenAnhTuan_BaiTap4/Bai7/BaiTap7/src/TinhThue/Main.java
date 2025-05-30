package TinhThue;

public class Main {
    public static void main(String[] args) {
        TaxableItem landTax = new LandTax();
        TaxCalculator landTaxCalculator = new TaxCalculator(landTax);
        System.out.println("Land Tax Rate: " + landTaxCalculator.getTaxRate());
        System.out.println("Land Tax Before Deductions: " + landTaxCalculator.calculateTax());
        System.out.println("Land Tax After Deductions: " + landTaxCalculator.applyDeductions());

        TaxableItem carbonTax = new CarbonTax();
        TaxCalculator carbonTaxCalculator = new TaxCalculator(carbonTax);
        System.out.println("Carbon Tax Rate: " + carbonTaxCalculator.getTaxRate());
        System.out.println("Carbon Tax Before Deductions: " + carbonTaxCalculator.calculateTax());
        System.out.println("Carbon Tax After Deductions: " + carbonTaxCalculator.applyDeductions());
    }
}
