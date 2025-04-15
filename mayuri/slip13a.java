class DisplayThreadName extends Thread {
    public DisplayThreadName(String name) {
        super(name); // Set the name of the thread
    }

    @Override
    public void run() {
        // Get and display the name of the currently executing thread
        System.out.println("Currently executing thread: " + Thread.currentThread().getName());
    }
}

class MultithreadingExample {
    public static void main(String[] args) {
        // Create and start multiple threads
        DisplayThreadName thread1 = new DisplayThreadName("Thread-One");
        DisplayThreadName thread2 = new DisplayThreadName("Thread-Two");
        DisplayThreadName thread3 = new DisplayThreadName("Thread-Three");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
