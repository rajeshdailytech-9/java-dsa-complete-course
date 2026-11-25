// Day 31: Hash tables, collisions, and load factor
import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        int[] values = {2, 7, 2, 9, 7, 7};
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int value : values) {
            frequency.merge(value, 1, Integer::sum);
        }
        System.out.println(frequency);
    }
}
