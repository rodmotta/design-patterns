package strategy.common;

import java.util.Objects;

public class PaymentProcessor {
    private final PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(double amount) {
        if (Objects.isNull(paymentMethod)) {
            throw new IllegalStateException("Payment method not supported");
        }
        paymentMethod.pay(amount);
    }
}
