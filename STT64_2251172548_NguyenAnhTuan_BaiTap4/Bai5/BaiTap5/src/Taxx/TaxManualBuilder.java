package Taxx;

public class TaxManualBuilder implements Builder {
    private TaxManual manual;

    public TaxManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new TaxManual();
    }

    @Override
    public void setPrice(double price) {
        this.manual.setPrice(price);
    }

    @Override
    public void setTaxType(String type) {
        this.manual.setTaxType(type);
    }

    @Override
    public void setTaxRate(double rate) {
        this.manual.setTaxRate(rate);
    }

    @Override
    public TaxManual getResult() {
        return this.manual;
    }
}