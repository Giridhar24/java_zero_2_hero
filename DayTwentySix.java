// Topic of the Day: Thread Synchronization (synchronized)
//
// Explanation: When two threads try to update the same variable at the same time, data gets corrupted (Race Condition).
// synchronized is a lock.
// It forces threads to form a single-file line. Only one thread can enter the method at a time.

class Counter {
    int count = 0;

    // WITHOUT 'synchronized', two threads might read '5' at the same time,
    // both add 1, and write '6' (instead of 7).
    public synchronized void increment() {
        count++;
    }
}

public class DayTwentySix {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        // Thread 1: Add 1000 times
        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++) c.increment();
        });

        // Thread 2: Add 1000 times
        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++) c.increment();
        });

        t1.start();
        t2.start();

        // Wait for both to finish
        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.count);
        // With 'synchronized', this is ALWAYS 2000.
        // Without it, it might be 1500, 1800, etc.
    }
}