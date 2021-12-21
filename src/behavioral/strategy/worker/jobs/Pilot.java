package behavioral.strategy.worker.jobs;

import behavioral.strategy.worker.strategies.eat.MeatFoodStrategy;
import behavioral.strategy.worker.strategies.transportation.AirPlaneStrategy;
import behavioral.strategy.worker.strategies.work.PilotStrategy;

public class Pilot implements Worker {

    @Override
    public void eat() {
        new MeatFoodStrategy().eat();
    }

    @Override
    public void transport() {
        new AirPlaneStrategy().transport();
    }

    @Override
    public void work() {
        new PilotStrategy().work();
    }
}
