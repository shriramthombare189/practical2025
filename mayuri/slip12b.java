import java.util.Random;

class ThreadLifecycle extends Thread {
    private String threadName;
    private int sleepTime;

    // Constructor to set the thread name
    public ThreadLifecycle(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println(threadName + " created.");
        try {
            // Generate a random sleep time in the range 0 to 4999
            sleepTime = new Random().nextInt(5000);
            System.out.println(threadName + " sleeping for " + sleepTime + " milliseconds.");
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " has completed execution and is now dead.");
    }
}

class ThreadLifecycleDemo {
    public static void main(String[] args) {
        // Creating threads with hardcoded names
        ThreadLifecycle thread1 = new ThreadLifecycle("Thread-One");
        ThreadLifecycle thread2 = new ThreadLifecycle("Thread-Two");
        ThreadLifecycle thread3 = new ThreadLifecycle("Thread-Three");

        // Starting the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
