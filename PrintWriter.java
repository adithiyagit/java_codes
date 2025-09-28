import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriter {
    public static void main(String[] args) {
        try {
            // Create PrintWriter for formatted output
            PrintWriter pw = new PrintWriter("report.txt");

            String name = "Alice";
            int marks = 87;
            double percentage = 87.0;

            // Write formatted text
            pw.println("Student: " + name);
            pw.println("Marks: " + marks);
            pw.printf("Percentage: %.2f%%", percentage);

            pw.close(); // Close writer
            System.out.println("Report written to report.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

