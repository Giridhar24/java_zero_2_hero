// Topic of the Day: JDBC (Connecting to Databases)
//
// Explanation: Java apps usually don't store data in variables (because they vanish when the app closes).
// They store it in SQL. JDBC (Java Database Connectivity) is the bridge.
//
// Steps: Load Driver -> Connect -> Create Statement -> Execute Query -> Process Results.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DayTwentySeven {
    public static void main(String[] args) {
        // Connection String (Example for SQLite)
        String url = "jdbc:sqlite:sample.db";

        // Try-with-resources (Auto-closes connection)
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            // 1. Execute Query
            String sql = "SELECT id, name FROM Employees";
            ResultSet rs = stmt.executeQuery(sql);

            // 2. Loop through results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}