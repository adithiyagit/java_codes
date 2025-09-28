import java.io.File;
import java.io.IOException;

public class DirectoryOperations {
    public static void main(String[] args) {
        try {
            // Create a directory "MyFiles"
            File dir = new File("MyFiles");
            if (dir.mkdir()) {
                System.out.println("Directory created: MyFiles");
            } else {
                System.out.println("Directory already exists.");
            }

            // Create 3 files inside directory
            File f1 = new File(dir, "a.txt");
            File f2 = new File(dir, "b.txt");
            File f3 = new File(dir, "c.txt");
            f1.createNewFile();
            f2.createNewFile();
            f3.createNewFile();

            // List all files in directory
            String[] files = dir.list();
            if (files != null) {
                System.out.println("Files in MyFiles:");
                for (String name : files) {
                    System.out.println(name);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



