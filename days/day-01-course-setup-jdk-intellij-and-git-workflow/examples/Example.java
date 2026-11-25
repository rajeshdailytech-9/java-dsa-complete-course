// Day 01: Course setup, JDK, IntelliJ, and Git workflow
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] values = {4, 1, 7, 1};
        System.out.println("Input: " + Arrays.toString(values));
        System.out.println("Sum: " + sum(values));
    }

    static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}
