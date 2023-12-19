package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class TechBlog implements Blog {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void publishArticle(String articleTitle) {
        System.out.println("New article published: " + articleTitle);
        notifyObservers(articleTitle);
    }

    private void notifyObservers(String articleTitle) {
        for (Observer observer : observers) {
            observer.update(articleTitle);
        }
    }
}
