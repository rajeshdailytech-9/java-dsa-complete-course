// Day 20: Doubly linked lists
public class Example {
    static final class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        print(reverse(head));
    }

    static Node reverse(Node head) {
        Node previous = null;
        while (head != null) {
            Node next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;
    }

    static void print(Node head) {
        for (Node current = head; current != null; current = current.next) {
            System.out.print(current.value + " ");
        }
        System.out.println();
    }
}
