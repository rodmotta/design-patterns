package behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        double value = 6543;
        System.out.println("Value: " + value);
        Invoice invoice = new Invoice(value, new StandardDiscount());
        System.out.println("Standard discounted value: " + invoice.discountedValue());
        invoice.setDiscountStrategy(new LoyaltyDiscount());
        System.out.println("Loyalty discounted value: " + invoice.discountedValue());
    }
}
