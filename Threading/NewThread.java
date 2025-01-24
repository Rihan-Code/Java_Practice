package Threading;

// This class extends the Thread class
class NewThread extends Thread {
    private Counter counter;

    public NewThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++) {
            counter.increment();
        }
    }
    
}