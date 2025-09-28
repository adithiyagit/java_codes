// 'protected' allows access within the same package and subclasses
class Employee {
    protected String name = "Alice";
    protected int salary = 90000;

    protected void showName() {
        System.out.println("Name: " + name);
    }

    protected void showSalary() {
        System.out.println("Salary: "+ salary);
    }
}

class Manager extends Employee {
    void display() {
        showName(); // Access protected method
        showSalary(); // Access protected method
        System.out.println("Accessing protected data: " + name);
        System.out.println("Accessing protected data: " + salary);
    }
}

public class Protected {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.display();
    }
}