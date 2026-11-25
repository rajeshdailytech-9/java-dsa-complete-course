// Day 29: Heap operations and heap sort
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Example {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.addLast(3);
        queue.addLast(1);
        queue.addLast(2);
        System.out.println("FIFO removal: " + queue.removeFirst());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(7); minHeap.add(2); minHeap.add(5);
        System.out.println("Minimum: " + minHeap.remove());
    }
}
