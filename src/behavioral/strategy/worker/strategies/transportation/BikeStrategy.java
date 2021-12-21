package behavioral.strategy.worker.strategies.transportation;

public class BikeStrategy implements TransportStrategy {

    @Override
    public void transport() {
        System.out.println("I use a Bike to go anywhere");
    }
}
