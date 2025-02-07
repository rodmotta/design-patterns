package observer.common;

public class SMSObserver implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("SMS Notification - Stock: " + stockName + ", Price: " + stockPrice);
    }
}
