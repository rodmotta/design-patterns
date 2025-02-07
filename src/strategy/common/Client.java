package strategy.common;

public class Client {
    public static void main(String[] args) {
        int paymentMethodCode = 3;
        double amount = 199.90;

        PaymentMethod paymentMethod = switch (paymentMethodCode) {
            case 1 -> new CreditCard();
            case 2 -> new Boleto();
            case 3 -> new Pix();
            default -> throw new IllegalArgumentException("Payment method not supported.");
        };

        PaymentProcessor processor = new PaymentProcessor(paymentMethod);
        processor.pay(amount);
    }
}
