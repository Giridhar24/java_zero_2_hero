// Topic of the Day: Generics (<T>)
// Explanation: We've seen ArrayList<String>.
// The <String> part is a Generic.
// It tells Java: "This list only accepts Strings."
// You can create your own classes that accept any type of data using <T>.

// A Box that can hold ANYTHING (T)
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}

public class DayTwentyOne {
    public static void main(String[] args) {
        // 1. Create a Box for Integers
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println("Integer Box: " + intBox.getItem());

        // 2. Create a Box for Strings
        Box<String> strBox = new Box<>();
        strBox.setItem("Hello World");
        System.out.println("String Box: " + strBox.getItem());

        // This prevents errors like trying to put a String in the Integer box!
    }
}