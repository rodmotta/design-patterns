package observer.common;

public class ConsoleObserver implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Console Update - Stock: " + stockName + ", Price: " + stockPrice);
    }
}
