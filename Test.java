import java.util.*;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        while (true) {
            try {
                System.out.print("Integer input: ");
                num = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                sc.nextLine(); // clear the invalid input
            }
        }

        double d = 0;
        while (true) {
            try {
                System.out.print("Double input: ");
                d = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a decimal number.");
                sc.nextLine(); // clear the invalid input
            }
        }

        sc.nextLine(); // consume leftover newline

        String str;
        System.out.print("Word input: ");
        str = sc.next(); // single word input
        sc.nextLine();   // consume leftover newline

        String line;
        System.out.print("String input: ");
        line = sc.nextLine(); // full line input

        // Display inputs
        System.out.println("\nInputs received:");
        System.out.println("Integer: " + num);
        System.out.println("Double: " + d);
        System.out.println("Word: " + str);
        System.out.println("Line: " + line);
    }
}
