package Homework23.Task1;

public class ArrayQueueModule {
    private static Object[] elements = new Object[2];
    private static int head = 0;
    private static int tail = 0;
    private static int size = 0;

    private static void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = size;
        }
    }

    public static void enqueue(Object element) {
        ensureCapacity();
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public static Object element() {
        return elements[head];
    }

    public static Object dequeue() {
        Object result = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return result;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        elements = new Object[2];
        head = 0;
        tail = 0;
        size = 0;
    }
}