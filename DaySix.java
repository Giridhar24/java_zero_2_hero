// Topic of the Day: Inheritance (extends and super)
// Explanation: In Java, we use the keyword extends to create a subclass.
// super: This keyword refers to the Parent class.
// It is often used to call the Parent's constructor to ensure the basic setup is done before adding the Child's specific setup.


// Parent
class Vehicle {
    String brand;
    public Vehicle(String b) {
        this.brand = b;
    }
}

// Child
class Car extends Vehicle {
    int wheels = 4;

    public Car(String b) {
        // Must call Parent constructor first!
        super(b);
    }

    public void honk() {
        System.out.println("The " + brand + " goes Beep!");
    }
}

public class DaySix {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.honk(); // Output: The Toyota goes Beep!
    }
}