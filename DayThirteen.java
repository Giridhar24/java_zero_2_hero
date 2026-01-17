// Topic of the Day: Abstract Classes
// Explanation: We learned Interfaces (100% abstract contracts) on Day 8.
// An Abstract Class is a mix. It can have:
// Abstract methods: (No code, must be overridden).
// Regular methods: (Has code, shared by all children).
// Rule: You cannot do new AbstractClass(). You must extend it.

// Abstract Class
abstract class Animal {
    // 1. Regular Method (Inherited by everyone)
    public void sleep() {
        System.out.println("Zzz...");
    }

    // 2. Abstract Method (Must be filled in by Child)
    public abstract void makeSound();
}

class Pig extends Animal {
    public void makeSound() {
        System.out.println("Oink");
    }
}

public class DayThirteen {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.makeSound(); // Oink
        myPig.sleep();     // Zzz... (Inherited)
    }
}