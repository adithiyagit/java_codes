import java.io.*;

public class PrintWriterFormattedOutput {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("report.txt")) {
            writer.println("Report Title: Student Scores");
            writer.println("Student 1: Score = 85");
            writer.printf("Student 2: Score = %d%n", 93);
            System.out.println("Data written to report.txt");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }
    }
}
