package strategy.common;

public class Boleto implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Generating barcode...");
        System.out.println("Paid $ " + amount + " with boleto.");
    }
}
