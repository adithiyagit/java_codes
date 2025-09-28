public class ThreeRunnableThreads {
    public static void main(String[] args) {
        // Runnable for Thread 1
        Runnable task1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(500); // pause for readability
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Runnable for Thread 2
        Runnable task2 = () -> {
            for (int i = 101; i <= 105; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Runnable for Thread 3
        Runnable task3 = () -> {
            for (int i = 1001; i <= 1005; i++) {
                System.out.println("Thread 3: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Create Thread objects
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
