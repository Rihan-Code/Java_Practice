package Threading.Bank;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 1000;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        
        // tryLock() acquires the lock only if it is free at the time of invocation.
        // Acquires the lock if it is available and return immediately with the value true. If the lock is not availabe then this method will return immediately with the value false.
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if(balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawl " + amount);
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " withdrawl successful. Remaining balance: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt(); // this is important as the process will lose the information regarding the interrupt of the thread which tried to access the resource
                    } finally { // finally block is used to release the lock, it is VERY IMPORTANT to release the lock in finally block.
                        lock.unlock();
                    } 
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance. Withdrawl failed.");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire lock. Withdrawl failed.");
            }
        } catch(Exception e) {
            Thread.currentThread().interrupt(); // this is important as the process will lose the information regarding the interrupt of the thread which tried to access the resource
        }
    }
}
