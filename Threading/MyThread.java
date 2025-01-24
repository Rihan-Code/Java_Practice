package Threading;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running...");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        t1.interrupt(); // the main thread interrupred the t1 thread, and therefore, "Thread is running..." do not get printed
    }
}
