package strategy.common;

public class Pix implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Generating qrcode...");
        System.out.println("Paid $ " + amount + " with pix.");
    }
}
