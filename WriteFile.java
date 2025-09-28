import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        try {
            // Take input from user
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter text to write into message.txt:");
            String data = sc.nextLine();

            // Create FileWriter to write to "message.txt"
            FileWriter fw = new FileWriter("message.txt");
            fw.write(data);  // Write user input into file
            fw.close();      // Close FileWriter
            sc.close();

            System.out.println("Successfully written to message.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
