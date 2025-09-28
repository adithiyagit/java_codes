import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        // Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();

        // Input second number
        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        // Calculate sum
        int sum = number1 + number2;

        // Display the result
        System.out.println("Sum = " + sum);

        // Close the scanner
        input.close();
    }
}

