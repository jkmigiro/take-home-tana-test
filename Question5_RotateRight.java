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

        //Formula for getting correct value of n to traverse
        n = len - (n % len);

        Node otherTail = head;
        for (int i = 1; i < n; i++) {
            otherTail = otherTail.next;
        }

        Node result = otherTail.next;
        otherTail.next = null;

        return result;
    }

}
