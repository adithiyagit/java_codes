import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double a, b;

        System.out.print("Enter first number: ");
        a = sc.nextDouble();
        System.out.print("Enter second number: ");
        b = sc.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
