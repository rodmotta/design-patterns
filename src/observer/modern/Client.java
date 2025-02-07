package observer.modern;

import java.util.function.BiConsumer;

public class Client {
    public static void main(String[] args) {
        StockData stockData = new StockData();

        stockData.addObserver(NotificationMethods::consoleNotification);
        stockData.addObserver(NotificationMethods::emailNotification);
        stockData.addObserver(NotificationMethods::smsNotification);

        BiConsumer<String, Double> testConsumer = (stockName, stockPrice) ->
                System.out.println("Test Notification - Stock: " + stockName + ", Price: " + stockPrice);
        stockData.addObserver(testConsumer);
        stockData.removeObserver(testConsumer);

        stockData.newStockData("Apple", 150.0);
        stockData.newStockData("Samsung", 110.0);
    }
}
