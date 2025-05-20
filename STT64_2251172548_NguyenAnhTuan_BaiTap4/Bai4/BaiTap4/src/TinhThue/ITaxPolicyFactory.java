package TinhThue;

public interface ITaxPolicyFactory {
    TaxableItem createLandTax(double price);
    TaxableItem createCarbonTax(double price);
}
