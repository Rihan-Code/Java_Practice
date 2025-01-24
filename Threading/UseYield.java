package Threading;

public class UseYield extends Thread {
    public UseYield(String name) {
        super(name);
    }
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }
    public static void main(String[] args) {
        UseYield t1 = new UseYield("t1");
        UseYield t2 = new UseYield("t2");
        t1.start();
        t2.start();
    }
}
