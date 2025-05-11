public class CalculateArea {
    private double length;
    private double width;

    public CalculateArea(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        CalculateArea rectangle1 = new CalculateArea(5.0, 3.0);
        CalculateArea rectangle2 = new CalculateArea(7.5, 4.0);
        CalculateArea rectangle3 = new CalculateArea(6.0, 2.5);

        System.out.println("Area of Rectangle 1: " + rectangle1.calculateArea());
        System.out.println("Area of Rectangle 2: " + rectangle2.calculateArea());
        System.out.println("Area of Rectangle 3: " + rectangle3.calculateArea());
    }
}
