package Homework23.Task1;

public class ArrayQueueTest {
    public static void main(String[] args) {
        testModule();
        testADT();
        testClass();
        System.out.println("Все тесты пройдены успешно!");
    }

    static void testModule() {
        ArrayQueueModule.clear();
        assert ArrayQueueModule.isEmpty();
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        assert ArrayQueueModule.size() == 2;
        assert ArrayQueueModule.element().equals(1);
        assert ArrayQueueModule.dequeue().equals(1);
        assert ArrayQueueModule.dequeue().equals(2);
        assert ArrayQueueModule.isEmpty();
    }

    static void testADT() {
        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.clear(queue);
        assert ArrayQueueADT.isEmpty(queue);
        ArrayQueueADT.enqueue(queue, "a");
        ArrayQueueADT.enqueue(queue, "b");
        assert ArrayQueueADT.size(queue) == 2;
        assert ArrayQueueADT.element(queue).equals("a");
        assert ArrayQueueADT.dequeue(queue).equals("a");
        assert ArrayQueueADT.dequeue(queue).equals("b");
        assert ArrayQueueADT.isEmpty(queue);
    }

    static void testClass() {
        ArrayQueue queue = new ArrayQueue();
        queue.clear();
        assert queue.isEmpty();
        queue.enqueue(10.5);
        queue.enqueue(20.5);
        assert queue.size() == 2;
        assert queue.element().equals(10.5);
        assert queue.dequeue().equals(10.5);
        assert queue.dequeue().equals(20.5);
        assert queue.isEmpty();
    }
}