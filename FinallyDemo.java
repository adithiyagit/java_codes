public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Trying risky operation...");
            int result = 100 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Exception caught!");
        } finally {
            System.out.println("Inside finally: Always runs (useful for cleanup)!");
        }
        System.out.println("After try-catch-finally.");
    }
}
