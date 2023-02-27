import java.util.NoSuchElementException;

public class LinkedListQueue {
    private Node head = null;
    private Node tail = null;

    public void enqueue(Object item) {
        Node newNode = new Node(item, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot dequeue from empty Queue");
        }
        Object item = head.item;
        if (tail == head) {
            tail = null;
        }
        head = head.next;
        return item;
    }

    public Object peek() {
        if (head == null) {
            throw new NoSuchElementException("Cannot peek from empty Queue");
        }
        return head.item;
    }

    public int size() {
        int count = 0;
        for (Node node = head; node != null; node = node.next) {
            count++;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void traverse() {
        Node temp = head;
        System.out.println("");
        while (temp != null) {
            System.out.println(temp.item);
            temp = temp.next;
        }
    }
}
