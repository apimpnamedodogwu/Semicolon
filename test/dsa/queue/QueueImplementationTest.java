package dsa.queue;

import org.junit.jupiter.api.BeforeEach;
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
        assertEquals(1, myQueue.queueSize());
    }

    @Test
    void pop() {
        myQueue.push(7);
        myQueue.push(8);
        myQueue.push(7);
        myQueue.pop();

    }

    @Test
    void peek() {
    }

    @Test
    void isEmpty() {
    }
}