package behavioral.strategy.worker.jobs;

import behavioral.strategy.worker.strategies.eat.MeatFoodStrategy;
import behavioral.strategy.worker.strategies.transportation.CarStrategy;
import behavioral.strategy.worker.strategies.work.DevelopStrategy;

public class Developer implements Worker {

    @Override
    public void eat() {
        new MeatFoodStrategy().eat();
    }

    @Override
    public void transport() {
        new CarStrategy().transport();
    }

    @Override
    public void work() {
        new DevelopStrategy().work();
    }
}
