package Mediator;

public abstract class Colega {
    public Mediator mediator;

    // methods/functions (behaviors)
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // two functions abstracts
    abstract void recibe();
    abstract void envia();
}
