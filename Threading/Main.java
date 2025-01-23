package Threading;

public class Main {
    public static void main(String[] args) {
        // This class extends the Thread class
        TestThread t1 = new TestThread();
        t1.start();
        TestThread t2 = new TestThread();
        t2.start();

        // This class implements the Runnable interface
        SecondTestThread t3 = new SecondTestThread();
        Thread t = new Thread(t3);
        t.start();

        // for ( ; ; ) {
        //     System.out.println(Thread.currentThread().getName());
        // }
    }
}
