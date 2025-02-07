package strategy.modern;

import java.util.function.Consumer;

public enum PaymentMethod {
    CREDIT_CARD(PaymentMethods::creditCard),
    BOLETO(PaymentMethods::boleto),
    PIX(PaymentMethods::pix);

    private final Consumer<Double> paymentStrategy;

    PaymentMethod(Consumer<Double> paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        paymentStrategy.accept(amount);
    }
}
