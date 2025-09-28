// Demonstration of Runnable-based thread creation
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running in " + Thread.currentThread().getName());
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
        System.out.println("Main ends.");
    }
}


