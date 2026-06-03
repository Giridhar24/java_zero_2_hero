// Topic of the Day: Enums
// Explanation: An Enum (Enumeration) is a special class that represents a group of constants.
// It is better than using Strings or Integers because it restricts choices to a valid set.
// Use Case: Days of the week, Pizza sizes, Order statuses.

// 1. Define the Enum (The only valid options)
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class DayTwelve {
    public static void main(String[] args) {
        // 2. Assigning an Enum
        Level myLevel = Level.MEDIUM;

        // 3. Using it in logic
        switch(myLevel) {
            case LOW:
                System.out.println("Low level selected");
                break;
            case MEDIUM:
                System.out.println("Medium level selected");
                break;
            case HIGH:
                System.out.println("High level selected");
                break;
        }
    }
}