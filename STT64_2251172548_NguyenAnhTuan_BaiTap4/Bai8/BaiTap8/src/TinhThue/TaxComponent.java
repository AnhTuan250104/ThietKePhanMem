package TinhThue;

public abstract class TaxComponent {
    protected TaxMediator mediator;

    public TaxComponent(TaxMediator mediator) {
        this.mediator = mediator;
    }

    public abstract double calculate();
}
