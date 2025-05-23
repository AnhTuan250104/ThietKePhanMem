package Taxx;

public class TaxManual {
    private double price;
    private String taxType;
    private double taxRate;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public String toString() {
        return "TaxManual [Price=" + price + ", TaxType=" + taxType + ", TaxRate=" + taxRate + "]";
    }
}