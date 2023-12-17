package behavioral.strategy;

public class StandardDiscount implements Discount {
    @Override
    public double calculate(double value) {
        return value * 0.1;
    }
}
