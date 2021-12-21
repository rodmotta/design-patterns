package behavioral.strategy.worker.jobs;

import behavioral.strategy.worker.strategies.eat.VeggieFoodStrategy;
import behavioral.strategy.worker.strategies.transportation.BikeStrategy;
import behavioral.strategy.worker.strategies.work.DevelopStrategy;

public class HipsterDeveloper implements Worker {

    @Override
    public void eat() {
        new VeggieFoodStrategy().eat();
    }

    @Override
    public void transport() {
        new BikeStrategy().transport();
    }

    @Override
    public void work() {
        new DevelopStrategy().work();
    }
}
