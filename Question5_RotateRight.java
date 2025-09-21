import java.util.*;

class Node {

    String item;
    Node next;

    Node(String item) {
        this.item = item;
    }

    public Node(String item, Node next) {
        this.item = item;
        this.next = next;
    }
}

public class Question5_RotateRight {

    static Node rotateToTheRight(Node head, int n) {
        // edge cases
        if (head == null || head.next == null || n == 0) {
            return head;
        }

        // Get the length
        Node curr = head;
        int len = 1;
        while (curr.next != null) {
            len++;
            curr = curr.next;
        }

        // Extend last node
        curr.next = head;

        // Formula for getting correct value of n
        n = len - (n % len);
        Node otherTail = head;
        for (int i = 1; i < n; i++) {
            otherTail = otherTail.next;
        }

        Node result = otherTail.next;
        otherTail.next = null;

        return result;
    }

    public static void main(String[] args) {
        Node head = new Node("ID_A01");
        head.next = new Node("ID_A02");
        head.next.next = new Node("ID_A03");
        head.next.next.next = new Node("ID_A04");
        head.next.next.next.next = new Node("ID_A05");
        head.next.next.next.next.next = new Node("ID_A06");
        var result = Question5_RotateRight.rotateToTheRight(head, 2);
        StringBuilder sb = new StringBuilder();
        Node current = result;
        while (current != null) {
            sb.append("\"");
            sb.append(current.item);
            sb.append("\"");
            if (current.next != null) {
                sb.append("->");
            }
            current = current.next;
        }
        sb.append("->null");
        System.out.println("Rotated list: " + sb.toString());

    }

}
