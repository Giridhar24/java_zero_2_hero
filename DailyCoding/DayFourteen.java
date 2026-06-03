// Topic of the Day: The static Keyword
// Explanation: In Java, static means "Belongs to the Class, not the Object."
// Instance Variable (No static): Every object has its own copy (e.g., every User has their own name).
// Static Variable: Shared by all objects (e.g., userCount is the same for everyone).

class User {
    String name;          // Unique per object
    static int userCount = 0; // Shared by ALL objects

    public User(String name) {
        this.name = name;
        userCount++; // Increment the SHARED counter
    }
}

public class DayFourteen {
    public static void main(String[] args) {
        User u1 = new User("Alice");
        User u2 = new User("Bob");

        // Access static variables via the Class Name, not the object
        System.out.println("Total Users: " + User.userCount); // Output: 2

        // u1.userCount and u2.userCount would also be 2,
        // because they share the same variable.
    }
}