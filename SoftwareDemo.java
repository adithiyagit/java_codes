// Base class
class Employee {
    protected String name;
    protected double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

// Subclass extending Employee
class SoftwareEngineer extends Employee {
    private String language;

    // Constructor
    public SoftwareEngineer(String name, double salary, String language) {
        super(name, salary);  // Correct double type for salary
        this.language = language;
    }

    // Overriding method
    public void showDetails() {
        super.showDetails();  // Call base class method
        System.out.println("Programming Language: " + language);
    }
}

// Main class with main() method
public class SoftwareDemo {
    public static void main(String[] args) {
        SoftwareEngineer se = new SoftwareEngineer("Adhi", 75000.0, "Python");
        se.showDetails();
    }
}
