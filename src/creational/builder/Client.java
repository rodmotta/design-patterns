package creational.builder;

public class Client {

    public static void main(String[] args) {
        Car car = Car.builder()
                .withBrand("Ford")
                .withModel("Mustang")
                .withYear(2023)
                .withColor("Black")
                .build();
        System.out.println(car);
    }
}
