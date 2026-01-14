// Topic of the Day: ArrayList (Dynamic Arrays)
// Explanation: On Day 4, we learned Arrays.
// The problem with standard Arrays (String[]) is that their size is fixed.
// You cannot add a 6th item to a size-5 array. ArrayList is dynamic.
// It grows and shrinks automatically.
// Note: You must import java.util.ArrayList.

import java.util.ArrayList;

public class DayTen {
    public static void main(String[] args) {
        // 1. Creation (Note the <String> type definition)
        ArrayList<String> shoppingList = new ArrayList<String>();

        // 2. Add items
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");

        // 3. Remove item (by index or name)
        shoppingList.remove("Eggs");

        // 4. Access item (.get instead of [])
        System.out.println("First item: " + shoppingList.get(0));
        System.out.println("List Size: " + shoppingList.size());
        System.out.println("Full List: " + shoppingList);
    }
}