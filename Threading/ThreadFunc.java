package Threading;

public class ThreadFunc extends Thread {
    ThreadFunc(String name) {
        super(name); // for giving the name to our new thread
    }

    @Override
    public void run() {
        System.out.println("Running");
        try {
            // Thread.sleep(2000); // timed waiting state for 2 seconds
            for(int i=0; i<5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - Count: " + i);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {

        // ThreadFunc t1 = new ThreadFunc("bluePlanet");
        // t1.setPriority(Thread.MIN_PRIORITY);
        // t1.start();

        // ThreadFunc m = new ThreadFunc("Min priority thread"); // LOW_PRIORITY = 1
        // ThreadFunc n = new ThreadFunc("Normal priority thread"); // MEDIUM_PRIORITY = 5
        // ThreadFunc h = new ThreadFunc("High priority thread"); // HIGH_PRIORITY = 10
        // m.setPriority(Thread.MIN_PRIORITY);
        // n.setPriority(Thread.NORM_PRIORITY);
        // h.setPriority(Thread.MAX_PRIORITY);
        // m.start();
        // n.start();
        // h.start();

        // System.out.println(t1.getState());
        // t1.start(); // the thread starts executing
        // System.out.println();
        // Thread.sleep(1000); // timed waiting state for 1 second 
        // System.out.println(t1.getState());
        // t1.join(); // main thread waits for t1 to finish
        // System.out.println(t1.getState());
        
    }
}
