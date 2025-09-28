import java.io.*;
import java.util.Scanner;

public class ScannerInputToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = new String[3];

        // Prompt user for input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter line " + (i + 1) + ": ");
            lines[i] = sc.nextLine();
        }

        // Write user input lines to file
        try (PrintWriter writer = new PrintWriter("user_input.txt")) {
            for (String line : lines) {
                writer.println(line);
            }
            System.out.println("Wrote input to user_input.txt");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Read and display file contents
        System.out.println("Reading file contents:");
        try (BufferedReader br = new BufferedReader(new FileReader("user_input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
