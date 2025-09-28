import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter first number: ");
        int a = sc.nextInt();  // Read first number

        System.out.print("Enter second number: ");
        int b = sc.nextInt();  // Read second number

        int sum = a + b;
        System.out.println("Sum = " + sum);  // Display sum
    }
}
