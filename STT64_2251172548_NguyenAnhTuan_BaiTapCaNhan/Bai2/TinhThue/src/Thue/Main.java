package Thue;

public class Main {
    public static void main(String[] args) {
        TaxableItem[] items = {
            new Book(60.0),
            new Book(90.0),
            new Electronics(150.0),
            new Electronics(250.0)
        };

        TaxCalculator calculator = new TaxCalculator();
        double totalTax = calculator.calculateTotalTax(items);

        System.out.println("Danh sách mặt hàng và thuế:");
        for (int i = 0; i < items.length; i++) {
            TaxableItem item = items[i];
            String itemType;
            double price;

            if (item instanceof Book) {
                itemType = "Sách";
                price = ((Book) item).getPrice();
            } else if (item instanceof Electronics) {
                itemType = "Thiết bị điện tử";
                price = ((Electronics) item).getPrice();
            } else {
                itemType = "Không xác định";
                price = 0.0;
            }

            System.out.printf("- Mặt hàng %d (%s): Giá = %.2f, Thuế = %.2f%n",
                    i + 1, itemType, price, item.calculateTax());
        }

        System.out.printf("%nTổng thuế phải nộp: %.2f%n", totalTax);
    }
}
