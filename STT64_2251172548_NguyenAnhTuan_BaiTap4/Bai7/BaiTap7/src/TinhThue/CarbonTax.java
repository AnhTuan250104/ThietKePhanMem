package TinhThue;

class CarbonTax implements TaxableItem {
    @Override
    public double getTaxRate() {
        return 0.03;
    }

    @Override
    public double calculateTax() {
        double baseAmount = 50000.0;
        return baseAmount * getTaxRate();
    }

    @Override
    public double applyDeductions() {
        double tax = calculateTax();
        double deductionRate = 0.05;
        return tax * (1 - deductionRate);
    }
}