package Homework23.Task2;

public class ArrayQueue extends AbstractQueue {
    private Object[] elements = new Object[2];
    private int head = 0;
    private int tail = 0;

    @Override
    public void enqueue(Object element) {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = size;
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    @Override
    public Object element() {
        return elements[head];
    }

    @Override
    public Object dequeue() {
        Object result = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return result;
    }

    @Override
    public void clear() {
        elements = new Object[2];
        head = 0;
        tail = 0;
        size = 0;
    }
}
