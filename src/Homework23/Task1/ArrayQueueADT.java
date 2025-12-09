package Homework23.Task1;

public class ArrayQueueADT {
    private Object[] elements = new Object[2];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    private static void ensureCapacity(ArrayQueueADT queue) {
        if (queue.size == queue.elements.length) {
            Object[] newElements = new Object[2 * queue.elements.length];
            for (int i = 0; i < queue.size; i++) {
                newElements[i] = queue.elements[(queue.head + i) % queue.elements.length];
            }
            queue.elements = newElements;
            queue.head = 0;
            queue.tail = queue.size;
        }
    }

    public static void enqueue(ArrayQueueADT queue, Object element) {
        ensureCapacity(queue);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    public static Object element(ArrayQueueADT queue) {
        return queue.elements[queue.head];
    }

    public static Object dequeue(ArrayQueueADT queue) {
        Object result = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return result;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        queue.elements = new Object[2];
        queue.head = 0;
        queue.tail = 0;
        queue.size = 0;
    }
}