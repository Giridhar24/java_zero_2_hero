// Explanation: An Interface is a "Contract." It lists methods that a class must have, but it doesn't provide the code for them.
// Why? It guarantees consistency. If I hire a "Driver" (Interface), I don't care if they drive a Truck or a Car (Classes), I just need to know they can drive().
// Keyword: implements.

// 1. The Contract (Interface)
interface PaymentMethod {
    void pay(int amount);
    // No body, just the signature
}

// 2. The Implementation (Classes signing the contract)
class CreditCard implements PaymentMethod {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using VISA.");
    }
}

class PayPal implements PaymentMethod {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

public class DayEight {
    public static void main(String[] args) {
        // Polymorphism in action again!
        PaymentMethod myCard = new CreditCard();
        myCard.pay(50);
    }
}