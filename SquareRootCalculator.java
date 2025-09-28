import java.util.Scanner;

public class SquareRootCalculator {
    public static double computeSqrt(double number) {
        if (number < 0)
            throw new ArithmeticException("Cannot compute square root of a negative number!");
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        try {
            double result = computeSqrt(num);
            System.out.println("Square root is: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        sc.close();
    }
}
