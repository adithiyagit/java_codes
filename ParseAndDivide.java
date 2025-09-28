import java.util.Scanner;

public class ParseAndDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input); //use of wrapper class Integer
            int result = 100 / number;
            System.out.println("Result is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        sc.close();
    }
}
