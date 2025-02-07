package observer.modern;

public class NotificationMethods {
    public static void consoleNotification(String stockName, double stockPrice) {
        System.out.println("Console Update - Stock: " + stockName + ", Price: " + stockPrice);
    }

    public static void emailNotification(String stockName, double stockPrice) {
        System.out.println("Email Update - Stock: " + stockName + ", Price: " + stockPrice);
    }

    public static void smsNotification(String stockName, double stockPrice) {
        System.out.println("SMS Update - Stock: " + stockName + ", Price: " + stockPrice);
    }
}
