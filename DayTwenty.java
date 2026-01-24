// Topic of the Day: Throwing Exceptions (throw)
// Explanation: We learned try/catch to handle errors.
// But sometimes, you want to create an error.
// If someone tries to withdraw negative money, you should throw an exception to stop the program immediately.

public class DayTwenty {

    // logic method
    static void withdraw(double amount) {
        if (amount < 0) {
            // We manually trigger an error here
            throw new IllegalArgumentException("Cannot withdraw negative amount!");
        }
        System.out.println("Withdrawing: $" + amount);
    }

    public static void main(String[] args) {
        try {
            withdraw(-50); // This will fail
        } catch (IllegalArgumentException e) {
            System.out.println("Blocked: " + e.getMessage());
        }
    }
}