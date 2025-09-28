import java.io.*;
import java.util.Scanner;

public class SumIntegersToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            // Read each integer safely
            while (!sc.hasNextInt()) {
                System.out.print("Please enter a valid integer: ");
                sc.next();
            }
            int num = sc.nextInt();
            sum += num;
        }

        // Write sum to file
        try (PrintWriter writer = new PrintWriter("sum.txt")) {
            writer.println(sum);
            System.out.println("Sum written to sum.txt");
        } catch (IOException e) {
            System.out.println("File write error: " + e.getMessage());
        }

        // Read sum from file and display
        try (BufferedReader reader = new BufferedReader(new FileReader("sum.txt"))) {
            String line = reader.readLine();
            System.out.println("Sum read from file: " + line);
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }

        sc.close();
    }
}
