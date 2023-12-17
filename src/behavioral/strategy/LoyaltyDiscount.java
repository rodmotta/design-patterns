package behavioral.strategy;

public class LoyaltyDiscount implements Discount {
    @Override
    public double calculate(double value) {
        return value * 0.15;
    }
}
