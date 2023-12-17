package creational.builder;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;

    public static CarBuilder builder() {
        Car car = new Car();
        return new CarBuilder(car);
    }

    public static class CarBuilder {
        private final Car car;

        public CarBuilder(Car car) {
            this.car = car;
        }

        public CarBuilder withBrand(String brand) {
            car.setBrand(brand);
            return this;
        }

        public CarBuilder withModel(String model) {
            car.setModel(model);
            return this;
        }

        public CarBuilder withYear(int year) {
            car.setYear(year);
            return this;
        }

        public CarBuilder withColor(String color) {
            car.setColor(color);
            return this;
        }

        public Car build() {
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
