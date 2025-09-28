import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try {
            // Open FileWriter in append mode (true)
            FileWriter fw = new FileWriter("message.txt", true);
            fw.write("\nThis is appended text."); // Add new content
            fw.close(); // Close the writer

            System.out.println("Successfully appended to message.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
