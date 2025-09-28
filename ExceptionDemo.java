public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Program started.");
        try {
            System.out.println("Attempting risky division...");
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result is: " + result); // This line won't execute
        } catch (ArithmeticException ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}
