public class Constant {
    private double radius;
    private static final double PI = 3.14159; 

    public Constant(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        
        Constant circle1 = new Constant(5.0);
        Constant circle2 = new Constant(7.5);

        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.radius);
        System.out.println("Circumference: " + circle1.calculateCircumference());
        System.out.println("Area: " + circle1.calculateArea());
        System.out.println("-------------------------");

        System.out.println("Circle 2:");
        System.out.println("Radius: " + circle2.radius);
        System.out.println("Circumference: " + circle2.calculateCircumference());
        System.out.println("Area: " + circle2.calculateArea());
    }
}