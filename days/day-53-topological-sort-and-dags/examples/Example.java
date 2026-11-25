// Day 53: Topological sort and DAGs
import java.util.ArrayDeque;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<List<Integer>> graph = List.of(List.of(1, 2), List.of(3), List.of(3), List.of());
        boolean[] visited = new boolean[graph.size()];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int node = queue.remove();
            System.out.print(node + " ");
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}
