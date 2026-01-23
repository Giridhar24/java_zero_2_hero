// Topic of the Day: The final Keyword
// Explanation: The word final locks things down.
// Final Variable: Logic cannot change it (It becomes a Constant).
// Final Method: Child classes cannot Override it.
// Final Class: No one can Inherit from it.

class SecurityConfig {
    // 1. Constant (Convention is ALL_CAPS)
    final double MAX_TIMEOUT = 10.5;

    // 2. Final Method
    final void login() {
        System.out.println("Standard Login Procedure");
    }
}

class HackConfig extends SecurityConfig {
    // void login() { ... }
    // COMPILER ERROR: Cannot override final method from SecurityConfig
}

public class DayNineteen {
    public static void main(String[] args) {
        SecurityConfig config = new SecurityConfig();
        // config.MAX_TIMEOUT = 20.0;
        // COMPILER ERROR: Cannot assign a value to final variable
    }
}