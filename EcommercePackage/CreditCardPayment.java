package EcommercePackage;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }

    @Override
    public void validateCard() {
        System.out.println("Validating credit card...");
    }
}

