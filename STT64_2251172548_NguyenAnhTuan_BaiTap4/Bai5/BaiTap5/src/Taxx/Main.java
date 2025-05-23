package Taxx;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

       
        TaxBuilder taxBuilder = new TaxBuilder();
        director.makeStandardTax(taxBuilder);
        Tax tax = taxBuilder.getResult();
        System.out.println("Standard Tax: " + tax);

        director.makeSpecialTax(taxBuilder);
        tax = taxBuilder.getResult();
        System.out.println("Special Tax: " + tax);

      
        TaxManualBuilder manualBuilder = new TaxManualBuilder();
        director.makeStandardTax(manualBuilder);
        TaxManual manual = manualBuilder.getResult();
        System.out.println("Standard Tax Manual: " + manual);

        director.makeSpecialTax(manualBuilder);
        manual = manualBuilder.getResult();
        System.out.println("Special Tax Manual: " + manual);
    }
}