import java.util.Scanner;

public class SwapWithThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();

        // Swapping using a third variable
        int temp = a;
        a = b;
        b = temp;

        // Display swapped values
        System.out.println("After swapping (using third variable):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();
    }
}
