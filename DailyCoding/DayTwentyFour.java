// Topic of the Day: Optional Class (Optional<T>)
//
// Explanation: NullPointerException is the most common error in Java.
//
// Optional is a container object which may or may not contain a non-null value.
//
// It forces you to think: "What if this is empty?"

import java.util.Optional;

public class DayTwentyFour {

    // Method that might return nothing
    static Optional<String> findUser(int id) {
        if (id == 1) {
            return Optional.of("Alice");
        } else {
            return Optional.empty(); // Better than returning null
        }
    }

    public static void main(String[] args) {
        Optional<String> result = findUser(2);

        // 1. Check safely
        if (result.isPresent()) {
            System.out.println("User: " + result.get());
        } else {
            System.out.println("User not found.");
        }

        // 2. Functional Style (Modern)
        // "If present, print it. If not, do nothing."
        result.ifPresent(name -> System.out.println("Found: " + name));

        // 3. Default Value
        String name = result.orElse("Guest User");
        System.out.println("Logged in as: " + name);
    }
}