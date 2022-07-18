package dsa.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackImplementationTest {
    StackForEden forEden;

    @BeforeEach
    void setUp() {
        forEden = new StackImplementation();
    }

    @Test
    void testNotNull() {
        assertNotNull(forEden);
    }

    @Test
    void isEmpty() {
        assertTrue(forEden.isEmpty());
    }

    @Test
    void isFull() {

        forEden.push(1);
        forEden.push(1);
        forEden.push(1);
        forEden.push(1);
        forEden.push(1);
        assertTrue(forEden.isFull());

    }

    @Test
    void testThatPushExceptionIsThrown() {
        forEden.push(1);
        forEden.push(1);
        forEden.push(1);
        forEden.push(1);
        forEden.push(1);
        assertThrows(RuntimeException.class,
                () -> forEden.push(1));
    }

    @Test
    void push() {
        forEden.push(1);
        forEden.push(1);
        forEden.push(1);
        forEden.push(1);
        forEden.push(1);
        var size = forEden.size();
        assertEquals(5, size);
    }

    @Test
    void pop() {
        forEden.push(1);
        forEden.push(2);
        forEden.push(3);
        forEden.pop();
        forEden.pop();
        var size = forEden.size();
        assertEquals(1, size);
    }

    @Test
    void testThatPopExceptionIsThrown() {
        assertThrows(RuntimeException.class,
                () -> forEden.pop());
    }

    @Test
    void testThatStackCanBePeekedInto() {
        forEden.push(1);
        forEden.push(2);
        forEden.push(3);
        var peeked = forEden.peek();
        assertEquals(3, peeked);
    }
}
