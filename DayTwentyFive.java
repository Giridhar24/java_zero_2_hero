// Topic of the Day: Multithreading (Thread class)
//
// Explanation: By default, Java does one thing at a time.
//
// Multithreading allows you to run tasks in parallel.
//
// This is crucial for performance (e.g., downloading a file in the background while the UI stays responsive).

// 1. Create a Worker
class Worker extends Thread {
    public void run() {
        System.out.println("Worker started on separate thread.");
        try {
            Thread.sleep(2000); // Simulate heavy work (2 seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker finished.");
    }
}

public class DayTwentyFive {
    public static void main(String[] args) {
        System.out.println("Main Program Start");

        // 2. Start the Thread
        Worker thread1 = new Worker();
        thread1.start(); // WARNING: Use .start(), not .run()!

        // This line runs IMMEDIATELY, without waiting for the worker
        System.out.println("Main Program continues...");
    }
}