package TinhThue;

public class SpecialGoodsTaxFactory implements ITaxPolicyFactory {
    @Override
    public TaxableItem createLandTax(double price) {
        return new ConsumptionTax(price);
    }

    @Override
    public TaxableItem createCarbonTax(double price) {
        return new ImportDutyTax(price);
    }
}