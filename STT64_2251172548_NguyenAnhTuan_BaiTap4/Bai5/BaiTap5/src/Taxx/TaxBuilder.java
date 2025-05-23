package Taxx;

public class TaxBuilder implements Builder {
    private Tax tax;

    public TaxBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.tax = new Tax();
    }

    @Override
    public void setPrice(double price) {
        this.tax.setPrice(price);
    }

    @Override
    public void setTaxType(String type) {
        this.tax.setTaxType(type);
    }

    @Override
    public void setTaxRate(double rate) {
        this.tax.setTaxRate(rate);
    }

    @Override
    public Tax getResult() {
        return this.tax;
    }
}