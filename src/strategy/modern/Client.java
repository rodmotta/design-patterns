package strategy.modern;

public class Client {
    public static void main(String[] args) {
        String paymentMethod = "CREDIT_CARD";
        double amount = 199.90;

        PaymentMethod.valueOf(paymentMethod).pay(amount);
    }
}
