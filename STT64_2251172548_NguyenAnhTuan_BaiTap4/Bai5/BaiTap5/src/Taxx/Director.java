package Taxx;


public class Director {
    public void makeStandardTax(Builder builder) {
        builder.reset();
        builder.setPrice(100.0);
        builder.setTaxType("LandTax");
        builder.setTaxRate(0.05); // 5%
    }

    public void makeSpecialTax(Builder builder) {
        builder.reset();
        builder.setPrice(200.0);
        builder.setTaxType("ImportDutyTax");
        builder.setTaxRate(0.10); // 10%
    }
}