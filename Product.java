public class Product {
    private String productName;
    private double price;
    private double discountPercentage;

    public Product(String productName, double price, double discountPercentage) {
        this.productName = productName;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    public double calculateFinalPrice() {
        return price - (price * discountPercentage / 100);
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: " + price);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Final Price: " + calculateFinalPrice());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        
        Product product1 = new Product("Laptop", 80000, 10);
        Product product2 = new Product("Smartphone", 50000, 15);
        Product product3 = new Product("Headphones", 2000, 5);

        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();
    }
}