package Queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    @Test
    void testEnqueueAndDequeue() {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        assertFalse(q.isEmpty());
        q.deQueue(); // remove 1
        q.deQueue(); // remove 2
        q.deQueue(); // remove 3
        assertTrue(q.isEmpty());
    }

    @Test
    void testEmptyQueueDequeue() {
        Queue q = new Queue();
        assertDoesNotThrow(q::deQueue);
    }

    @Test
    void testOrderPreserved() {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        assertEquals(5, q.front.data);
        assertEquals(7, q.rear.data);
    }

}