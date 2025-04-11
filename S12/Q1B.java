import java.util.Random;

class MyThread extends Thread {
    String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println("Thread '" + threadName + "' created and started.");

        Random rand = new Random();
        int sleepTime = rand.nextInt(5000); // 0 to 4999 milliseconds

        System.out.println("Thread '" + threadName + "' will sleep for " + sleepTime + " ms.");

        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println("Thread '" + threadName + "' interrupted.");
        }

        System.out.println("Thread '" + threadName + "' has completed and is now dead.");
    }
}
 class ThreadLifecycleDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-A");
        MyThread t2 = new MyThread("Thread-B");
        MyThread t3 = new MyThread("Thread-C");

        t1.start();
        t2.start();
        t3.start();
    }
}
