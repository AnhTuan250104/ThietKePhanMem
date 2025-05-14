package TinhThue;

public class Main {
    public static void main(String[] args) {
        
        BookFactory bookFactory = new BookFactory();
        ElectronicsFactory electronicsFactory = new ElectronicsFactory();

        
        TaxableItem book = bookFactory.createItem(100.0); 
        TaxableItem electronics = electronicsFactory.createItem(200.0); 

        
        TaxableItem[] items = {book, electronics};

       
        TaxCalculator calculator = new TaxCalculator();
        double totalTax = calculator.CalculateTotalTax(items);

        
        System.out.println("Tổng Thuế: " + totalTax );
        
    }
}