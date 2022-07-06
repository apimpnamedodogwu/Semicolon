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
        var size = mySet.getArraylist();
        assertEquals(2, size.size());
        assertFalse(mySet.isEmpyty());
    }

    @Test
    void testThatAnItemCanBeRemoved() {
        mySet.add("Bread!");
        mySet.add("Bread!");
        mySet.add("Love");
        mySet.remove(mySet.getArraylist().getIndex(0));
        var size = mySet.getArraylist();
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