import java.io.*;

public class CopyBinaryFile {
    public static void main(String[] args) {
        try {
            // Input stream for binary file
            FileInputStream fin = new FileInputStream("photo.jpg");
            // Output stream for copied file
            FileOutputStream fout = new FileOutputStream("photo_copy.jpg");

            int b;
            while ((b = fin.read()) != -1) {
                fout.write(b); // Write each byte to new file
            }

            fin.close();
            fout.close();

            System.out.println("Binary file copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

