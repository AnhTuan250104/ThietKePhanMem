package TinhThue;

public class LandAdapter implements TaxableItem {
    private Land land;

    public LandAdapter(Land land) {
        this.land = land;
    }

    @Override
    public double calculateTax() {
        return land.VND(); 
    }
}