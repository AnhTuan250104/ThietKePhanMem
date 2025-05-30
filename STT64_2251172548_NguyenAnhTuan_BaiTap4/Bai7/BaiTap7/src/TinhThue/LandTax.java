package TinhThue;

class LandTax implements TaxableItem {
    @Override
    public double getTaxRate() {
        return 0.05;
    }

    @Override
    public double calculateTax() {
        double baseAmount = 100000.0;
        return baseAmount * getTaxRate();
    }

    @Override
    public double applyDeductions() {
        double tax = calculateTax();
        double deductionRate = 0.10;
        return tax * (1 - deductionRate);
    }
}