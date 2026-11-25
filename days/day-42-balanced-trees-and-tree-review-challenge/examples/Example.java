// Day 42: Balanced trees and tree review challenge
import java.util.ArrayDeque;
import java.util.Deque;

public class Example {
    static final class Node {
        int value;
        Node left, right;
        Node(int value) { this.value = value; }
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        System.out.println("In-order: " + inOrder(root));
    }

    static String inOrder(Node node) {
        if (node == null) return "";
        return inOrder(node.left) + node.value + " " + inOrder(node.right);
    }
}
