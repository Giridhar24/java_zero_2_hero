// Topic of the Day: Managing Lists of Objects
// Explanation: In real apps, you don't store Strings in a list; you store Objects.
// Today we combine Class + ArrayList to create an Inventory System.

import java.util.ArrayList;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class DayFifteen {
    public static void main(String[] args) {
        // 1. Create a List that holds 'Product' objects
        ArrayList<Product> inventory = new ArrayList<>();

        // 2. Add Objects
        inventory.add(new Product("Laptop", 999.99));
        inventory.add(new Product("Mouse", 25.50));

        // 3. Iterate over Objects
        for (Product p : inventory) {
            System.out.println("Item: " + p.name + " | Cost: $" + p.price);
        }
    }
}