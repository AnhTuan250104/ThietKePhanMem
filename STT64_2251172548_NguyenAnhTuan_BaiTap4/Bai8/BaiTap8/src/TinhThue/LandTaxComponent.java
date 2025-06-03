package TinhThue;

public class LandTaxComponent extends TaxComponent {

    public LandTaxComponent(TaxMediator mediator) {
        super(mediator);
    }

    @Override
    public double calculate() {
        double tax = 1500.0; // giả định
        System.out.println("Land tax calculated: " + tax);
        mediator.notify(this);
        return tax;
    }
}
