import java.util.NoSuchElementException;

public class Node {
    Object item;

    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }


}
