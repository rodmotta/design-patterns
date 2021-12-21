package behavioral.strategy.worker.strategies.transportation;

public class AirPlaneStrategy implements TransportStrategy {

    @Override
    public void transport() {
        System.out.println("I use an Airplane to go anywhere");
    }
}
