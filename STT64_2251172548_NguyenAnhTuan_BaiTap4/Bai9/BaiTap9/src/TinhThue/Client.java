package TinhThue;

class Client {
    public static void main(String[] args) {
        Context context = new Context();

        // Sử dụng LandTax
        TaxableItem landTax = new LandTax(1000.0);
        context.setTaxableItem(landTax);
        System.out.println("Thuế LandTax: " + context.Calculate());

        // Sử dụng CarbonTax
        TaxableItem carbonTax = new CarbonTax(1000.0);
        context.setTaxableItem(carbonTax);
        System.out.println("Thuế CarbonTax: " + context.Calculate());
    }
}