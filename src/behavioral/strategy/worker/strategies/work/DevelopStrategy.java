package behavioral.strategy.worker.strategies.work;

public class DevelopStrategy implements WorkStrategy {

    @Override
    public void work() {
        System.out.println("I code apps to earn some money");
    }
}
