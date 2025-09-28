class StateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Thread running."); 
        });
        System.out.println("State after creation: " + t.getState());
        t.start();
        System.out.println("State after start: " + t.getState());
        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}

