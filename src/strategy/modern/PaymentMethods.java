package strategy.modern;

public class PaymentMethods {
    public static void creditCard(double amount) {
        System.out.println("Validating credit card...");
        System.out.println("Paid $ " + amount + " with credit card.");
    }

    public static void boleto(double amount) {
        System.out.println("Generating barcode...");
        System.out.println("Paid $ " + amount + " with boleto.");
    }

    public static void pix(double amount) {
        System.out.println("Generating qrcode...");
        System.out.println("Paid $ " + amount + " with pix.");
    }
}
