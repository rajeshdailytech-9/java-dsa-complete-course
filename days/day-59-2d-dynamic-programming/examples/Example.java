// Day 59: 2D dynamic programming
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] values = {3, 4, -1, 0, 6, 2, 3};
        int[] bestEndingHere = new int[values.length];
        bestEndingHere[0] = values[0];
        for (int index = 1; index < values.length; index++) {
            bestEndingHere[index] = Math.max(values[index], bestEndingHere[index - 1] + values[index]);
        }
        System.out.println(Arrays.toString(bestEndingHere));
    }
}
