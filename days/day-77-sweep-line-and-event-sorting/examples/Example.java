// Day 77: Sweep line and event sorting
public class Example {
    public static void main(String[] args) {
        UnionFind sets = new UnionFind(5);
        sets.union(0, 1);
        sets.union(1, 2);
        System.out.println("0 and 2 connected: " + (sets.find(0) == sets.find(2)));
    }

    static final class UnionFind {
        private final int[] parent;
        UnionFind(int size) {
            parent = new int[size];
            for (int index = 0; index < size; index++) parent[index] = index;
        }
        int find(int value) {
            if (parent[value] != value) parent[value] = find(parent[value]);
            return parent[value];
        }
        void union(int first, int second) {
            parent[find(first)] = find(second);
        }
    }
}
