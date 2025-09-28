// Final class
final class Final {
    void show() {
        System.out.println("This is a final class.");
    }
}

// Attempting to extend the final class
class AttemptedSubclass extends Final {  // ❌ Compilation Error
    void display() {
        System.out.println("Trying to extend final class.");
    }
}
