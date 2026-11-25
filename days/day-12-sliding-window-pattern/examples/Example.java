// Day 12: Sliding window pattern
import java.util.ArrayDeque;
import java.util.Deque;

public class Example {
    public static void main(String[] args) {
        System.out.println("Factorial(5): " + factorial(5));
    }

    static int factorial(int value) {
        if (value <= 1) {
            return 1;
        }
        return value * factorial(value - 1);
    }
}
