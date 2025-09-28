// Demonstration of basic thread creation by extending Thread
class MyThread extends Thread {
    public void run() {
        System.out.println("Hello from " + this.getName());
    }
}

public class ExtendThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Create a new thread object
        t1.start(); // Start the thread (calls run())
        System.out.println("Main thread finished.");
    }
}
