//Topic of the Day: Polymorphism (Overloading vs. Overriding)
//Explanation: Java distinguishes between two types of polymorphism:
//Overriding (Runtime): A Child class replaces a Parent's method (same name, same parameters).
//Overloading (Compile time): Writing multiple methods with the same name but different parameters within the same class.

class Calculator {

    // Method 1: Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: OVERLOADING (Same name, different parameters)
    // Adds three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: OVERLOADING
    // Adds doubles
    public double add(double a, double b) {
        return a + b;
    }
}

public class DaySeven {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));      // Calls Method 1
        System.out.println(calc.add(5, 10, 20));  // Calls Method 2
        System.out.println(calc.add(5.5, 2.2));   // Calls Method 3
    }
}