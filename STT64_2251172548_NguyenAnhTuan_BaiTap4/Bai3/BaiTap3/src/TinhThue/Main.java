package TinhThue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Nhập số lượng mặt hàng: ");
        int itemCount = scanner.nextInt();
        
        TaxableItem[] items = new TaxableItem[itemCount];
        TaxableItemFactory bookFactory = new BookFactory();
        TaxableItemFactory electronicsFactory = new ElectronicsFactory();

        // Nhập giá và loại mặt hàng
        for (int i = 0; i < itemCount; i++) {
            System.out.print("Nhập giá cho mặt hàng " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            
            System.out.print("Chọn loại (1 cho Book, 2 cho Electronics): ");
            int type = scanner.nextInt();
            
            if (type == 1) {
                items[i] = bookFactory.createItem(price);
            } else if (type == 2) {
                items[i] = electronicsFactory.createItem(price);
            } else {
                System.out.println("Loại không hợp lệ, mặc định là Book.");
                items[i] = bookFactory.createItem(price);
            }
        }

        TaxCalculator calculator = new TaxCalculator();
        double totalTax = calculator.CalculateTotalTax(items);
        System.out.println("Tổng thuế: " + totalTax);

        scanner.close();
    }
}