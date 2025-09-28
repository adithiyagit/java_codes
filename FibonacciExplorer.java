import java.util.Scanner;

public class FibonacciExplorer {

    // Static counter to count recursive calls
    static int recursiveCallCount = 0;

    // Recursive Fibonacci method
    public static int fibonacci(int n) {
        recursiveCallCount++;
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Fibonacci Recursion Explorer ===");
        System.out.print("Enter the number of Fibonacci terms to print: ");
        int n = scanner.nextInt();

        System.out.println("\nFibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\n\nTotal Recursive Calls Made: " + recursiveCallCount);

        scanner.close();
    }
}
