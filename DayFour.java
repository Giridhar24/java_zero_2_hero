// Topic of the Day: Methods (Structure & Return Types)
// Explanation: In Java, functions are called Methods. Because Java is statically typed, you must declare:
// Visibility: Who can see it? (public)
// Return Type: What does it give back? (int, String, void if nothing).
// Parameter Types: What inputs does it take?


public class DayFour {

    // 1. Method Definition
    // 'public static': Standard access modifiers
    // 'int': Promises to return an integer
    // '(int a, int b)': Expects two integers as input
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // 2. Void Method
    // 'void' means this method performs an action but returns nothing
    public static void printMessage(String msg) {
        System.out.println("Alert: " + msg);
    }

    public static void main(String[] args) {
        int sum = addNumbers(5, 10); // Capture the return value
        printMessage("The sum is " + sum);
    }
}
