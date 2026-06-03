// Topic of the Day: HashMap
// Explanation:We learned ArrayList (dynamic lists) yesterday.
// Today is HashMap (Key-Value pairs).
// This is Java's version of the Python Dictionary.
// It stores data as (Key, Value).Lookups are incredibly fast ($O(1)$).

import java.util.HashMap;

public class DayEleven {
    public static void main(String[] args) {
        // Map <KeyType, ValueType>
        HashMap<String, String> capitals = new HashMap<String, String>();

        // 1. Insert Data
        capitals.put("USA", "Washington D.C.");
        capitals.put("Japan", "Tokyo");
        capitals.put("India", "New Delhi");

        // 2. Retrieve Data (using the Key)
        System.out.println("Capital of Japan: " + capitals.get("Japan"));

        // 3. Check if Key exists
        if(capitals.containsKey("France")) {
            System.out.println("France is in the list.");
        } else {
            System.out.println("France is missing.");
        }
    }
}