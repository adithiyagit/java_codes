import java.util.Scanner;

public class UserAccessLogger {

    // --- User class ---
    static class User {
        private String username;           // private field
        protected String email;            // protected field
        public int userId;                 // public field

        public static final int MAX_USERS = 100; // final constant

        // Constructor to set private and protected fields
        public User(int userId, String username, String email) {
            this.userId = userId;
            this.username = username;
            this.email = email;
        }

        // Getter for private field
        public String getUsername() {
            return username;
        }

        // Setter for private field
        public void setUsername(String username) {
            this.username = username;
        }

        // Display user info
        public void displayInfo() {
            System.out.println("User ID   : " + userId);
            System.out.println("Username  : " + username);
            System.out.println("Email     : " + email);
        }
    }

    // --- Logger class demonstrating access ---
    static class Logger {
        public void logUserAccess(User user) {
            System.out.println("\nLogging Access...");
            System.out.println("Accessing public userId     : " + user.userId);         // public - OK
            System.out.println("Accessing protected email   : " + user.email);          // protected - OK (same package)
            // System.out.println("Accessing private username : " + user.username);     // ❌ private - Not Allowed
            System.out.println("Accessing private username via getter: " + user.getUsername()); // ✅ via public method
        }
    }

    // --- Main method ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== User Access Logger ===");
        System.out.print("Enter User ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Username: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        // Create user object
        User user = new User(id, name, email);

        // Display user info
        System.out.println("\nUser Info:");
        user.displayInfo();

        // Log user access
        Logger logger = new Logger();
        logger.logUserAccess(user);

        // Access final constant
        System.out.println("\nMaximum allowed users (final constant): " + User.MAX_USERS);

        scanner.close();
    }
}
