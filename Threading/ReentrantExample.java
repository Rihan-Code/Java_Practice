package Threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    // Use to avoid DEADLOCK
    // With reentrantLock a count is also maintained which keep the count of the locks
    private final Lock lock = new ReentrantLock(); 

    public void outerMethod() {
        lock.lock(); // it will acquire the lock, and put other  threads in waiting state untill it is unlocked
        try {
            System.out.println("Outer Method");
            innerMethod();
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock(); // since the same 'lock' is trying to lock the inner method as well so this should have gone in the state of deadlock but we have reentrantLock that will avoid the deadlock condition
        try {
            System.out.println("Inner Method");
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            lock.unlock();
        }
    }
     
    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}
