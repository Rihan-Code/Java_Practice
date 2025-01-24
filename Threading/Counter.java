package Threading;

public class Counter {
    private int count = 0;

    // this will synchronize the whole method
    // public synchronized void increment() {
    //     count++;
    // }

    public void increment() {
        // when we want to synchronize a part of the whole method
        synchronized(this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
