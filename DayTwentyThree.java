//Topic of the Day: Streams API (.stream())
//
//Explanation: Java 8 introduced Streams, which allow functional-style operations on collections. It replaces clunky for loops with clean pipelines.
//
//Pipeline: Source -> Filter -> Map -> Collect.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DayTwentyThree {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Goal: Find even numbers, square them, and collect into a list
        List<Integer> result = numbers.stream()
                // 1. Filter: Keep only evens
                .filter(n -> n % 2 == 0)

                // 2. Map: Transform (square the number)
                .map(n -> n * n)

                // 3. Collect: Turn stream back into List
                .collect(Collectors.toList());

        System.out.println(result);
        // Output: [4, 16, 36, 64, 100]
    }
}

