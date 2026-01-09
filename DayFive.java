// Topic of the Day: Intro to OOP (The new keyword)
// Explanation: Java is purely Object-Oriented. To use a class blueprint, you must "instantiate" it using the new keyword. This allocates memory for that specific object.
// The Blueprint

class Car {
    String model;
    int year;

    // Constructor (Same name as class, no return type)
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println(model + " engine started.");
    }
}

public class DayFive {
    public static void main(String[] args) {
        // Creating an Object using 'new'
        Car myCar = new Car("Tesla", 2024);

        // Accessing methods
        myCar.startEngine();

        // Accessing attributes
        System.out.println("Year: " + myCar.year);
    }
}