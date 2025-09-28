
import java.io.*;

public class CopyTextFile {
    public static void main(String[] args) {
        try {
            // Reader for original file
            BufferedReader br = new BufferedReader(new FileReader("message.txt"));
            // Writer for new file
            PrintWriter pw = new PrintWriter("copy.txt");

            String line;
            while ((line = br.readLine()) != null) {
                pw.println(line);  // Write each line into copy.txt
            }

            br.close(); // Close input stream
            pw.close(); // Close output stream

            System.out.println("File copied to copy.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

