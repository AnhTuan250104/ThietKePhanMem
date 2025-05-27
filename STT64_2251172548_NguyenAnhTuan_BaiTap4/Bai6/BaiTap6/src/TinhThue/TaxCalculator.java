package TinhThue;

public class TaxCalculator {
    public double calculateTotalTax(TaxableItem[] items) {
        double totalTax = 0.0;
        for (TaxableItem item : items) {
            totalTax += item.calculateTax();
        }
        return totalTax;
    }

    public static void main(String[] args) {
        // Tạo các đối tượng Land và Carbon
        Land land1 = new Land(100.0);
        Land land2 = new Land(200.0);
        Carbon carbon1 = new Carbon(300.0);

        // Tạo các Adapter
        TaxableItem[] items = {
            new LandAdapter(land1),
            new LandAdapter(land2),
            new CarbonAdapter(carbon1)
        };

        // Tính tổng thuế
        TaxCalculator calculator = new TaxCalculator();
        double totalTax = calculator.calculateTotalTax(items);

        // In kết quả
        System.out.println("Tổng thuế: " + totalTax);
    }
}