//  Topic of the Day: The main Method Anatomy

//  Explanation: Java is statically typed and verbose.
//  Every line of code must live inside a class.
//  The entry point of any Java application is a specific method called public static void main(String[] args).
//  Without this, the program won't run.

// 1. Everything happens inside a Class
public class DayOne {

    // 2. The Main Method: The door the computer enters through
    public static void main(String[] args) {

        // 3. Strong Typing: You MUST say 'int' or 'String'
        int number = 100;
        String goal = "Zero to Hero";

        // 4. Printing to console
        System.out.println("Status: Starting " + goal);
        System.out.println("Level: " + number);
    }
}