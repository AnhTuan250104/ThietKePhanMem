package TinhThue;

public class CarbonTaxComponent extends TaxComponent {

    public CarbonTaxComponent(TaxMediator mediator) {
        super(mediator);
    }

    @Override
    public double calculate() {
        double tax = 800.0; // giả định
        System.out.println("Carbon tax calculated: " + tax);
        mediator.notify(this);
        return tax;
    }
}
