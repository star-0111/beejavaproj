package EcommercePackage;

public class Customer extends User {
    public Customer(int userId, String username, String email) {
        super(userId, username, email);
    }

    @Override
    public String getUserDetails() {
        return "Customer: " + username + " (" + email + ")";
    }

    public void placeOrder(int productId) {
        System.out.println("Placing order for product ID: " + productId);
    }

    public void placeOrder(int productId, int quantity) {
        System.out.println("Placing order for product ID: " + productId + " with quantity: " + quantity);
    }
}

