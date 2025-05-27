package TinhThue;

public class CarbonAdapter implements TaxableItem {
    private Carbon carbon;

    public CarbonAdapter(Carbon carbon) {
        this.carbon = carbon;
    }

    @Override
    public double calculateTax() {
        return carbon.Dollar(); // Chuyển đổi yêu cầu sang phương thức của Carbon
    }
}