package behavioral.observer;

public interface Blog {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void publishArticle(String articleTitle);
}
