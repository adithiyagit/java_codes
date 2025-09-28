import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            // Open file for reading
            BufferedReader br = new BufferedReader(new FileReader("message.txt"));

            String line;
            int lineCount = 0;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }

            br.close(); // Close the reader
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
