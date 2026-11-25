// Day 13: Linear and binary search
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] values = {7, 2, 9, 4, 2};
        Arrays.sort(values);
        int target = 4;
        System.out.println(Arrays.toString(values));
        System.out.println("Index of " + target + ": " + binarySearch(values, target));
    }

    static int binarySearch(int[] values, int target) {
        int left = 0, right = values.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (values[middle] == target) return middle;
            if (values[middle] < target) left = middle + 1;
            else right = middle - 1;
        }
        return -1;
    }
}
