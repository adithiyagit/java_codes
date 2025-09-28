import java.util.Scanner;

public class ReverseFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, rev = 0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (; num != 0; num = num / 10) {
            rev = rev * 10 + num % 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}

