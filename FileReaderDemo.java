import java.io.*;

public class FileReaderDemo {

    static void readFile() throws IOException {
        System.out.println("Trying to open 'data.txt'");
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            System.out.print("File contains: ");
            while ((line = br.readLine()) != null) {
                System.out.print(line);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException ex) {
            System.out.println("Exception: " + ex);
        }
    }
}

