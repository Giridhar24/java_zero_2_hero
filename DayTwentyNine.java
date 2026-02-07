// Topic of the Day: Parallel Streams
//
// Explanation: We learned Streams on Day 23. Parallel Streams split the work across multiple CPU cores automatically.
//
// Warning: Only use this for massive lists (10,000+ items). For small lists, the overhead of splitting the work makes it slower.

import java.util.ArrayList;
import java.util.List;

public class DayTwentyNine {
    public static void main(String[] args) {
        List<Integer> bigList = new ArrayList<>();
        for(int i=0; i<1000000; i++) bigList.add(i);

        long start = System.currentTimeMillis();

        // 1. Sequential Stream (One Core)
        // long count = bigList.stream().filter(n -> n % 2 == 0).count();

        // 2. Parallel Stream (All Cores)
        long count = bigList.parallelStream().filter(n -> n % 2 == 0).count();

        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");
        System.out.println("Count: " + count);
    }
}