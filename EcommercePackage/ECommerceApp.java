package EcommercePackage;

public class ECommerceApp {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 5000.0, 10);

        Customer c1 = new Customer(1, "bee_gemini", "bee@example.com");
        Admin a1 = new Admin(2, "admin_stark", "tony@starkindustries.com");

        System.out.println(c1.getUserDetails());
        c1.placeOrder(101);
        c1.placeOrder(101, 2);

        System.out.println(a1.getUserDetails());
        a1.updateProduct(p1, 4500.0, 15);

        Payment payment1 = new CreditCardPayment();
        payment1.validateCard();
        payment1.processPayment();

        Payment payment2 = new PayPalPayment();
        payment2.validateCard();
        payment2.processPayment();
    }
}
