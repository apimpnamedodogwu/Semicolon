package dsa.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueImplementationTest {
    Queue myQueue;

    @BeforeEach
    void setUp() {
        myQueue = new QueueImplementation();
    }

    @Test
    void push() {
        myQueue.push(7);
        myQueue.push(8);
        myQueue.push(9);
        assertEquals(3, myQueue.queueSize());
    }


    @Test
    void pop() {
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(5);
        var item = myQueue.pop();
        var itemTwo = myQueue.pop();
        assertEquals(1, item);
        assertEquals(2, itemTwo);
        assertEquals(3, myQueue.queueSize());

    }

    @Test
    void testThatPushExceptionIsThrown() {
        myQueue.push(7);
        myQueue.push(8);
        myQueue.push(9);
        myQueue.push(7);
        myQueue.push(8);
        assertThrows(RuntimeException.class,
                () -> myQueue.push(8));

    }

    @Test
    void peek() {
        myQueue.push(1);
        myQueue.push(2);
        assertEquals(1, myQueue.peek());
    }

    @Test
    void popAssertionIsThrown() {
        assertThrows(RuntimeException.class,
                () -> myQueue.pop());
    }

    @Test
    void testThatQueueIsEmpty() {
        assertTrue(myQueue.isEmpty());
    }

    @Test
    void testThatQueueCanBeFull() {
        myQueue.push(7);
        myQueue.push(8);
        myQueue.push(9);
        myQueue.push(7);
        myQueue.push(8);
        assertTrue(myQueue.isFull());
    }

}