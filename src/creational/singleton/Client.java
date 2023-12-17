package creational.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Hello, Rodrigo!");
        Singleton anotherSingleton = Singleton.getInstance("Hello, World!");
        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());
        anotherSingleton.setValue("Changed value!");
        System.out.println(singleton.getValue());
    }
}
