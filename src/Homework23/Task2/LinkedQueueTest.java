package Homework23.Task2;

public class LinkedQueueTest {
    public static void main(String[] args) {
        testLinkedQueue();
        testArrayQueue();
        System.out.println("Все тесты пройдены успешно!");
    }

    static void testLinkedQueue() {
        Queue queue = new LinkedQueue();
        assert queue.isEmpty();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assert queue.size() == 3;
        assert queue.element().equals(1);
        assert queue.dequeue().equals(1);
        assert queue.size() == 2;
        queue.clear();
        assert queue.isEmpty();
    }

    static void testArrayQueue() {
        Queue queue = new ArrayQueue();
        assert queue.isEmpty();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        assert queue.size() == 3;
        assert queue.element().equals("a");
        assert queue.dequeue().equals("a");
        assert queue.size() == 2;
        queue.clear();
        assert queue.isEmpty();
    }
}
