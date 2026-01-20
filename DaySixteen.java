// Topic of the Day: Encapsulation (Getters & Setters)
// Explanation: Encapsulation is a security concept.
// You should not allow direct access to sensitive variables (like salary or password).
// Instead, you make variables private and provide public "Gatekeeper" methods (get and set) to control access.

class Employee {
    // 1. Private Variable (Hidden from outside)
    private double salary;

    // 2. Setter (The Gatekeeper)
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    // 3. Getter (Read-only access)
    public double getSalary() {
        return this.salary;
    }
}

public class DaySixteen {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // emp.salary = -500; // ERROR: usage of private field not allowed

        emp.setSalary(-500); // Output: Error: Salary cannot be negative.
        emp.setSalary(50000); // Works

        System.out.println("Current Salary: " + emp.getSalary());
    }
}