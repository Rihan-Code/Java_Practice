package Threading;

// This class extends the Thread class
class TestThread extends Thread {
    @Override
    public void run() {
        for ( ; ; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}