package TinhThue;

public class Main {
    public static void main(String[] args) {
        
        ItemFactory bookFactory = new BookFactory();
        ItemFactory electronicsFactory = new ElectronicsFactory();

        
        TaxableItem[] items = new TaxableItem[] {
            bookFactory.createItem(60.0),         
            bookFactory.createItem(90.0),        
            electronicsFactory.createItem(150.0), 
            electronicsFactory.createItem(250.0)  
        };

       
        TaxCalculator calculator = new TaxCalculator();
        double totalTax = calculator.calculateTotalTax(items);

       
     
        System.out.println("Danh sách mặt hàng và thuế:");
        for (int i = 0; i < items.length; i++) {
            String itemType = items[i] instanceof Book ? "Sách" : "Thiết bị điện tử";
            System.out.printf("- Mặt hàng %d (%s): Giá = %.2f, Thuế = %.2f%n",
                i + 1, itemType, items[i].getPrice(), items[i].calculateTax());
        }

        System.out.printf("%nTổng thuế phải nộp: %.2f%n", totalTax);
        
    }
}
