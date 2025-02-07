package observer.common;

public class EmailObserver implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Email Notification - Stock: " + stockName + ", Price: " + stockPrice);
    }
}
