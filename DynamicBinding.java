import java.util.Scanner;

// Base class Shape
class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

// Derived class for Circle
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

// Derived class for Square
class Square extends Shape {
    void draw() {
        System.out.println("Drawing square");
    }
}

// Derived class for Triangle
class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing triangle");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // For user input

        // Displaying menu to the user
        System.out.println("----- Shape Drawing Menu -----");
        System.out.println("1. Draw Circle");
        System.out.println("2. Draw Square");
        System.out.println("3. Draw Triangle");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt(); // Getting the user's choice

        Shape s; // Reference of type Shape

        // Deciding which object to create based on user's choice
        switch (choice) {
            case 1:
                s = new Circle();
                break;
            case 2:
                s = new Square();
                break;
            case 3:
                s = new Triangle();
                break;
            default:
                System.out.println("Invalid choice! Drawing default shape.");
                s = new Shape();
        }

        s.draw(); // Dynamic binding takes place here

        scanner.close();
    }
}

