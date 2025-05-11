// Manual Car Showroom Inventory Create a Car class with attributes: brand, model, price. Create 5 different Car objects with different details. Display the cars whose price is greater than 20,00,000 (use if statement).
public class CarShowroom {
     String brand;
     String model;
     double price;

    public CarShowroom(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        
        CarShowroom car1 = new CarShowroom("Tesla", "AI", 7500000);
        CarShowroom car2 = new CarShowroom("Bentley", "SL", 6000000);
        CarShowroom car3 = new CarShowroom("Toyota", "Corolla", 2000000);
        CarShowroom car4 = new CarShowroom("Volskwagen", "Tutnado", 1000000);
        CarShowroom car5 = new CarShowroom("Porsche", "C", 5500000);

        System.out.println("Cars with price greater than 20,00,000:");
        if (car1.price > 2000000) car1.displayCarDetails();
        if (car2.price > 2000000) car2.displayCarDetails();
        if (car3.price > 2000000) car3.displayCarDetails();
        if (car4.price > 2000000) car4.displayCarDetails();
        if (car5.price > 2000000) car5.displayCarDetails();
    }
}