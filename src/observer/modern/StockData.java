package observer.modern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class StockData {
    private final List<BiConsumer<String, Double>> observers = new ArrayList<>();

    public void addObserver(BiConsumer<String, Double> observer) {
        observers.add(observer);
    }

    public void removeObserver(BiConsumer<String, Double> observer) {
        observers.remove(observer);
    }

    public void newStockData(String stockName, double price) {
        observers.forEach(observer -> observer.accept(stockName, price));
    }
}
