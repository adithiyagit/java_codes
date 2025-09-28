public class ExceptionInfoDemo {
    public static void main(String[] args) {
        try {
            int ans = 10 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Exception occurred: " + ex);
            System.out.println("Message: " + ex.getMessage());
            ex.printStackTrace(); // Prints stack trace to show where the problem happened
        }
    }
}

