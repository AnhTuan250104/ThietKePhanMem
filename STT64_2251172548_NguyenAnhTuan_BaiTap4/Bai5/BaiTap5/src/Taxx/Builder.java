package Taxx;

public interface Builder {
    void reset();
    void setPrice(double price);
    void setTaxType(String type);
    void setTaxRate(double rate);
    Object getResult();
}