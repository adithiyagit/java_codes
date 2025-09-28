class SharedData {
    int data;
    boolean ready = false;
    public synchronized void produce(int x) throws InterruptedException {
        data = x; ready = true;
        System.out.println("Produced " + x);
        notify();
    }
    public synchronized int consume() throws InterruptedException {
        while (!ready) wait();
        System.out.println("Consumed " + data);
        return data;
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) {
        SharedData sd = new SharedData();
        Thread producer = new Thread(() -> { try { sd.produce(50); } catch (Exception e) {} });
        Thread consumer = new Thread(() -> { try { sd.consume(); } catch (Exception e) {} });
        consumer.start(); producer.start();
    }
}


