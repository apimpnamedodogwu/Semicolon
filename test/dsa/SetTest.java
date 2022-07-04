package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
    Set mySet;
    @BeforeEach
    void setUp() {
        mySet = new Set();
    }
    @Test
    void testThatSetCanBeCreated() {
        assertNotNull(mySet);
    }

    @Test
    void testThatSetIsEmpty() {
        var fullOrNot = mySet.isEmpyty();
        assertTrue(fullOrNot);
    }

    @Test
    void testThatSetCanBeAddedTo() {
        mySet.add("Bread!");
        mySet.add("Bread!");
        mySet.add("Love");
        var size = mySet.getArrayList();
        assertEquals(2, size.size());
    }

    @Test
    void testThatAnItemCanBeRemoved() {
        mySet.add("Bread!");
        mySet.add("Bread!");
        mySet.add("Love");
        mySet.remove(mySet.getArrayList().getIndex(0));
        var size = mySet.getArrayList();
        assertEquals(1, size.size());
    }

    @Test
    void testThatAnItemCanBeGotten() {
        mySet.add("Bread!");
        mySet.add("Bread!");
        mySet.add("Love");
        var result = mySet.get(1);
        assertEquals("Love", result);
    }
}