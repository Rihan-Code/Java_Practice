package Threading;

public class SecondTestThread implements Runnable {
    @Override
    public void run() {
        for ( ; ; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    
}
