package observer.common;

public class Client {
    public static void main(String[] args) {
        StockData stockData = new StockData();

        ConsoleObserver consoleObserver = new ConsoleObserver();
        EmailObserver emailObserver = new EmailObserver();
        SMSObserver smsObserver = new SMSObserver();

        stockData.addObserver(consoleObserver);
        stockData.addObserver(emailObserver);
        stockData.addObserver(smsObserver);
        stockData.removeObserver(consoleObserver);

        stockData.newStockData("Apple", 150.0);
        stockData.newStockData("Samsung", 110.0);
    }
}
