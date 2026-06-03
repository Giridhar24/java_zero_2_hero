// Topic of the Day: Dependency Injection (DI)
//
// Explanation: This is the core concept behind Spring Boot.
//
// Instead of a class creating its own dependencies (new Engine()), you inject them from the outside.
//
// This makes testing easy (you can inject a fake engine).

// Service Interface
interface Service {
    void serve();
}

class RealService implements Service {
    public void serve() { System.out.println("Real Service Running"); }
}

class Client {
    private Service service;

    // BAD:
    // public Client() { this.service = new RealService(); }
    // (Client is stuck with RealService forever)

    // GOOD (Dependency Injection):
    // We pass the service IN via the constructor.
    public Client(Service service) {
        this.service = service;
    }

    public void doWork() {
        service.serve();
    }
}

public class DayTwentyEight {
    public static void main(String[] args) {
        // We inject the dependency here
        Service s = new RealService();
        Client c = new Client(s);
        c.doWork();
    }
}