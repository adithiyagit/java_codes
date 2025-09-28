import java.util.Scanner;

public class VowelCheckerSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if (Character.isLetter(ch))
                    System.out.println(ch + " is a consonant.");
                else
                    System.out.println("Invalid input.");
        }
    }
}
