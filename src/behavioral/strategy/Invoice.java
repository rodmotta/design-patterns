package behavioral.strategy;

public class Invoice {
    private double value;
    private Discount discountStrategy;

    public Invoice(double value, Discount discountStrategy) {
        this.value = value;
        this.discountStrategy = discountStrategy;
    }

    public double discountedValue() {
        double discount = discountStrategy.calculate(value);
        return value - discount;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Discount getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(Discount discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
