import java.io.*;

public class ThrowsExample {
    // Method declares it may throw IOException
    static void readFile() throws IOException {
        System.out.println("Trying to open 'test.txt'");
        FileInputStream file = new FileInputStream("test.txt");
 // FileNotFoundException if file doesn't exist
        file.close();
        System.out.println("'test.txt' opened and closed successfully");
    }
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException ex) {
            System.out.println("Exception: " + ex); // Shows the exception thrown
        }
    }
}
