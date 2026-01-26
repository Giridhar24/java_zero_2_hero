// Topic of the Day: Lambda Expressions (->)
// Explanation: Before Java 8, if you wanted to pass a simple action (like "print this"), you had to write a whole class.
// Lambdas allow you to treat code as data.
// They are concise functions used primarily with Functional Interfaces (interfaces with only one method).

import java.util.ArrayList;

public class DayTwentyTwo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Old Way (Verbose)
        /* for (String name : names) {
            System.out.println(name);
        }
        */

        // New Way (Lambda)
        // Read as: "For each name, print the name"
        names.forEach(name -> System.out.println(name));

        // Even shorter (Method Reference)
        // names.forEach(System.out::println);
    }
}