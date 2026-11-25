// Day 64: Greedy strategy and proof intuition
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 4}, {5, 7}, {6, 8}};
        Arrays.sort(intervals, (first, second) -> Integer.compare(first[0], second[0]));
        int count = 0;
        int end = Integer.MIN_VALUE;
        for (int[] interval : intervals) {
            if (interval[0] >= end) {
                count++;
                end = interval[1];
            }
        }
        System.out.println("Greedy selections: " + count);
    }
}
