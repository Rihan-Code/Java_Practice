package Threading;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        NewThread t1 = new NewThread(counter);
        NewThread t2 = new NewThread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }
        System.out.println(counter.getCount());
    }
}
