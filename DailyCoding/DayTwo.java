// Topic of the Day: Primitives vs. Strings
// Explanation: In Java, there is a big difference between simple numbers (Primitives) and text (Objects/Strings).
// Primitives (int, double, boolean): Store the actual value in memory. Simple and fast.
// Strings: Are complex "Objects." They come with built-in helper methods (like checking the length or converting to uppercase).

public class DayTwo {
    public static void main(String[] args) {
        // 1. Primitive Types (Store simple values)
        int age = 25;
        double price = 19.99;
        boolean isJavaFun = true;

        // 2. String (An Object with "powers")
        String message = "Hello World";

        // Because 'message' is an Object, we can use dot (.) notation to call methods
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Length: " + message.length());

        // 3. String Concatenation
        // Combining primitives and objects
        System.out.println("The price is " + price);
    }
}