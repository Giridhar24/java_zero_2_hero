// Topic of the Day: Exceptions (try / catch)
// Explanation: When working with files (or anything risky), things break.
// The file might be missing; the drive might be full.
// Java forces you to handle these errors using try (attempt the code) and catch (handle the error if it fails).

public class DayNine {
    public static void main(String[] args) {

        try {
            // Risky code goes here
            int[] numbers = {1, 2, 3};

            // Intentionally crashing the program (Index 5 doesn't exist)
            System.out.println(numbers[5]);

        } catch (Exception e) {
            // This runs ONLY if an error occurs
            System.out.println("Something went wrong!");
            System.out.println("Error details: " + e.getMessage());
        } finally {
            // This runs NO MATTER WHAT (Cleanup code)
            System.out.println("Execution finished.");
        }
    }
}