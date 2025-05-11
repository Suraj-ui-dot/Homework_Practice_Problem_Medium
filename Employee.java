public class Employee {
    private String name;
    private double salary;
    private int yearsOfExperience;

    public Employee(String name, double salary, int yearsOfExperience) {
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public double calculateBonus() {
        if (yearsOfExperience > 5) {
            return salary * 0.20; 
        } else {
            return salary * 0.10; 
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Mahesh", 50000, 6);
        Employee emp2 = new Employee("Suraj", 40000, 3);
        Employee emp3 = new Employee("Abhishek", 60000, 8);

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
    }
}