package EcommercePackage;

public class Admin extends User {
    public Admin(int userId, String username, String email) {
        super(userId, username, email);
    }

    @Override
    public String getUserDetails() {
        return "Admin: " + username + " (" + email + ")";
    }

    public void updateProduct(Product p, double newPrice, int newStock) {
        p.setPrice(newPrice);
        p.setStock(newStock);
        System.out.println("Product updated: " + p.getName());
    }
}

