package TinhThue;

public class ConcreteTaxMediator implements TaxMediator {
    private LandTaxComponent land;
    private CarbonTaxComponent carbon;

    public void setLandComponent(LandTaxComponent land) {
        this.land = land;
    }

    public void setCarbonComponent(CarbonTaxComponent carbon) {
        this.carbon = carbon;
    }

    @Override
    public void notify(TaxComponent sender) {
        if (sender == land) {
            reactOnLand();
        } else if (sender == carbon) {
            reactOnCarbon();
        }
    }

    private void reactOnLand() {
        System.out.println("Mediator reacts to LandTaxComponent.");
        // Thêm xử lý nếu cần
    }

    private void reactOnCarbon() {
        System.out.println("Mediator reacts to CarbonTaxComponent.");
        // Thêm xử lý nếu cần
    }
}
