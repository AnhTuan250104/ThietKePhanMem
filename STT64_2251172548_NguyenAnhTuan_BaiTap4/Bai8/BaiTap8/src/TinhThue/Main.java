package TinhThue;

public class Main {
    public static void main(String[] args) {
        ConcreteTaxMediator mediator = new ConcreteTaxMediator();

        LandTaxComponent landTax = new LandTaxComponent(mediator);
        CarbonTaxComponent carbonTax = new CarbonTaxComponent(mediator);

        mediator.setLandComponent(landTax);
        mediator.setCarbonComponent(carbonTax);

        landTax.calculate();
        carbonTax.calculate();
    }
}
