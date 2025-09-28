import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check leap year conditions
        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        // Output the result
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        scanner.close();
    }
}
