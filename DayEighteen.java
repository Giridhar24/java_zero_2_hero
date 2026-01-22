// Topic of the Day: Interface Polymorphism
// Explanation: This is the most common design pattern in enterprise Java.
// You write your code to talk to an Interface, not a specific class.
// This lets you swap out implementations easily (e.g., Switching from PayPal to Stripe without rewriting your whole app).

// 1. The Contract
interface PaymentProcessor {
    void process(double amount);
}

// 2. Implementation A
class PayPalNew implements PaymentProcessor {
    public void process(double amount) {
        System.out.println("Processing $" + amount + " via PayPalNew API...");
    }
}

// 3. Implementation B
class Stripe implements PaymentProcessor {
    public void process(double amount) {
        System.out.println("Processing $" + amount + " via Stripe API...");
    }
}

public class DayEighteen {
    public static void main(String[] args) {
        // The variable type is the INTERFACE
        PaymentProcessor payment = new Stripe();

        // We can change 'new Stripe()' to 'new PayPalNew()'
        // and the rest of the code works perfectly.
        payment.process(100.00);
    }
}