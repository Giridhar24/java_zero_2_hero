// Topic of the Day: Inheritance in Depth (super)
// Explanation: We revisit Inheritance to build a hierarchy.
// We will create a Manager class that extends Employee and adds a bonus feature.


// Parent
class EmployeeNew {
    String name;
    double baseSalary;

    public EmployeeNew(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

// Child
class Manager extends EmployeeNew {
    double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary); // Call Parent Constructor
        this.bonus = bonus;
    }

    // Overriding the parent's method
    @Override
    public double calculatePay() {
        return baseSalary + bonus;
    }
}

public class DaySeventeen {
    public static void main(String[] args) {
        Manager boss = new Manager("Big Boss", 80000, 5000);
        System.out.println("Manager Pay: " + boss.calculatePay());
    }
}