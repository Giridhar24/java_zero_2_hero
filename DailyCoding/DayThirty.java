// Topic of the Day: Singleton Pattern (Design Patterns)
//
// Explanation: In large systems, you sometimes want exactly one instance of a class (e.g., a Database Connection Pool).
//
// Creating 100 connections crashes the app. The Singleton pattern ensures only one object ever exists.

class DatabaseConnection {
    // 1. Static instance (The only one)
    private static DatabaseConnection instance = null;

    // 2. Private Constructor (No one else can say 'new DatabaseConnection()')
    private DatabaseConnection() {
        System.out.println("Connecting to Database...");
    }

    // 3. Public Access Method
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}

public class DayThirty {
    public static void main(String[] args) {
        // First call: Creates the object
        DatabaseConnection db1 = DatabaseConnection.getInstance();

        // Second call: Returns the EXISTING object (No new print statement)
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println(db1 == db2); // true
    }
}