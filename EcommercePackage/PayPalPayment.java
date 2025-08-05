package EcommercePackage;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }

    @Override
    public void validateCard() {
        System.out.println("Validating PayPal account...");
    }
}

