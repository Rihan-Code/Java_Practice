package Threading;

public class UseOfDaemonThread extends Thread{
    public UseOfDaemonThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true) {
            System.out.println("Welcome to Blue Planet...");
        }
    }

    public static void main(String[] args) {
        UseOfDaemonThread t1 = new UseOfDaemonThread("t1");
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main thread terminates.");
    }
}
