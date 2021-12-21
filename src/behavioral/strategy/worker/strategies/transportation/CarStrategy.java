package behavioral.strategy.worker.strategies.transportation;

public class CarStrategy implements TransportStrategy {

    @Override
    public void transport() {
        System.out.println("I use a Car to go anywhere");
    }
}
