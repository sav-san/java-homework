package Homework23.Task2;

public class LinkedQueue extends AbstractQueue {
    private static class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    @Override
    public void enqueue(Object element) {
        Node newNode = new Node(element);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
    }

    @Override
    public Object element() {
        return head.value;
    }

    @Override
    public Object dequeue() {
        Object value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
