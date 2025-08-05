package EcommercePackage;

public class Product {
    private int productId;
    private String name;
    private double price;
    private int stock;

    public Product(int productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
        setStock(stock);
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
        else
            System.out.println("Invalid price.");
    }

    public void setStock(int stock) {
        if (stock >= 0)
            this.stock = stock;
        else
            System.out.println("Invalid stock.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
