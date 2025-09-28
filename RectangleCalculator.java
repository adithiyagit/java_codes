import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input length
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Input breadth
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate area
        double area = length * breadth;

        // Calculate perimeter
        double perimeter = 2 * (length + breadth);

        // Display the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        // Close the scanner
        scanner.close();
    }
}
