package observer.common;

import java.util.ArrayList;
import java.util.List;

public class StockData {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double stockPrice;
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void newStockData(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, stockPrice);
        }
    }
}
