package ArrayQueue;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Object[] queue;  // underlying array to hold queue elements
    int head = 0;  // index of front element in queue
    int tail = 0;  // index of rear element in queue
    public int size;  // number of elements in queue

    public ArrayQueue(int capacity) {
        queue = new Object[capacity];
    }
    public void enqueue(Object item) {
        if (size == queue.length) {
            throw new IllegalStateException("Cannot add to full queue");
        }
        queue[tail] = item;
        tail = (tail + 1) % queue.length;
        size++;
    }
    public void dequeue() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot remove from empty queue");
        }
        Object item = queue[head];
        queue[head] = null;
        head = (head + 1) % queue.length;
        size--;
    }
    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot peek from empty queue");
        }
        return queue[head];
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void printQueue() {
        if (isEmpty()) {
            throw new NoSuchElementException ("Cannot print from empty queue");
        }
        for (int i = 0; i < size; i++) {
            int index = (head + i) % queue.length;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }
}
