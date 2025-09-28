import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        try {
            // Open file with numbers
            Scanner sc = new Scanner(new File("numbers.txt"));

            int sum = 0, count = 0;

            // Read integers until file ends
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                sum += num;
                count++;
            }

            sc.close();
            double average = (count > 0) ? (double) sum / count : 0;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
