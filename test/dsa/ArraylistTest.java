package dsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraylistTest {
    Arraylist arraylist;

    @BeforeEach
    void setUp() {
        arraylist = new Arraylist();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void testThatArraylistIsNotNull() {
        assertNotNull(arraylist);
    }

    @Test
    void testThatArraylistIsEmpty() {
        var trueOrFalse = arraylist.isEmpty();
        assertTrue(trueOrFalse);
    }

    @Test
    void testThatArraylistCanBeAddedTo() {
        arraylist.add("Bread!");
        arraylist.add("Bread!");
        arraylist.add("Bread!");
        arraylist.add("Bread!");
        arraylist.add("Bread!");
        var size = arraylist.size();
        assertEquals(5, size);
    }

    @Test
    void testThatArraylistIsNotEmptyWhenAddedTo() {
        arraylist.add("Bread!");
        arraylist.add("Bread!");
        arraylist.add("Bread!");
        arraylist.add("Bread!");
        arraylist.add("Bread!");
        var trueOrFalse = arraylist.isEmpty();
        assertFalse(trueOrFalse);
    }

    @Test
    void testThatArraylistCanBeRemovedFrom() {
        arraylist.add("Bread!");
        arraylist.add("Love!");
        arraylist.remove("Bread!");
        var size = arraylist.size();
        assertEquals(1, size);
    }

    @Test
    void testThatArrayCapacityCanBeDoubled() {
        arraylist.add("Bread!");
        arraylist.add("Tea!");
        arraylist.add("Juice!");
        arraylist.add("Coffee!");
        arraylist.add("Croissant!");
        arraylist.add("Omelette!");
        arraylist.add("Akara!");
        var arrayCapacity = arraylist.capacity();
        var actualSize = arraylist.size();
        assertEquals(12, arrayCapacity);
        assertEquals(7, actualSize);
    }
}