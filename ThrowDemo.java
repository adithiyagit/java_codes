public class ThrowDemo {
    static int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Custom error: Cannot divide by zero!");
        return a / b;
    }
    public static void main(String[] args) {
        try {
            int result = divide(5, 0); // Triggers custom throw
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Manual exception thrown: " + ex.getMessage());
        }
    }
}
