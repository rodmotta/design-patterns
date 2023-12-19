package behavioral.observer;

public class Reader implements Observer {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(String articleTitle) {
        System.out.println(name + " received a notification: " + articleTitle);
    }
}
