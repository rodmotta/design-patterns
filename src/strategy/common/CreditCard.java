package strategy.common;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Validating credit card...");
        System.out.println("Paid $ " + amount + " with credit card.");
    }
}
