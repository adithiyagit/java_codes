import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p, r, t, si;

        System.out.print("Enter Principal: ");
        p = sc.nextFloat();

        System.out.print("Enter Rate: ");
        r = sc.nextFloat();

        System.out.print("Enter Time: ");
        t = sc.nextFloat();

        si = (p * r * t) / 100; // SI formula
        System.out.println("Simple Interest = " + si);
    }
}

