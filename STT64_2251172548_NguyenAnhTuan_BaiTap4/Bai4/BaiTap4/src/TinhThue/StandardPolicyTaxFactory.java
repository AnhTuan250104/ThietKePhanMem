package TinhThue;

public class StandardPolicyTaxFactory implements ITaxPolicyFactory {
    @Override
    public TaxableItem createLandTax(double price) {
        return new LandTax(price);
    }

    @Override
    public TaxableItem createCarbonTax(double price) {
        return new CarbonTax(price);
    }
}