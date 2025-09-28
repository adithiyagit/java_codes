import java.io.*;

public class WriteReadSimpleFile {
    public static void main(String[] args) {
        // Writing to file
        try (FileWriter fw = new FileWriter("welcome.txt")) {
            fw.write("Welcome to Java File I/O!\n");
            System.out.println("Wrote to file: welcome.txt");
        } catch (IOException e) {
            System.out.println("Error writing: " + e.getMessage());
        }

        // Reading from file
        try (BufferedReader br = new BufferedReader(new FileReader("welcome.txt"))) {
            System.out.println("Reading from file: welcome.txt");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("From file: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading: " + e.getMessage());
        }
    }
}
