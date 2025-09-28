import java.io.File;

public class CheckFile {
    public static void main(String[] args) {
        // Create a File object representing "data.txt"
        File f = new File("data.txt");

        // Check if the file exists
        if (f.exists()) {
            System.out.println("File name: " + f.getName());              // Get file name
            System.out.println("Absolute path: " + f.getAbsolutePath());  // Get absolute path
            System.out.println("Writable: " + f.canWrite());              // Check write permission
            System.out.println("Readable: " + f.canRead());               // Check read permission
            System.out.println("File size in bytes: " + f.length());      // Get file size
        } else {
            System.out.println("The file does not exist.");
        }
    }
}

