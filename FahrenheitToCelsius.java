import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("Temperature in Celsius: " + celsius);

        scanner.close();
    }
}
