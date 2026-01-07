// Topic of the Day: The for Loop
// Explanation: The Java for loop is very structured. It has three parts inside the parentheses:
// Initialization: Start point (int i = 0)
// Condition: When to stop (i < 5)
// Increment: How to move forward (i++)

public class DayThree {
    public static void main(String[] args) {

        // 1. Standard For Loop
        // equivalent to: "Start at 0; Keep going while i is less than 5; Add 1 to i after each run"
        System.out.println("--- Standard Loop ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Counter: " + i);
        }

        // 2. Enhanced For-Each Loop (for arrays)
        // Read as: "For each name in names"
        System.out.println("\n--- For-Each Loop ---");
        String[] names = {"Java", "Python", "SQL"};

        for (String name : names) {
            System.out.println("Language: " + name);
        }
    }
}