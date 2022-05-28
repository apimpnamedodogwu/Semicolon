package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    ShoppingCart cart;

    @BeforeEach
        void setUp() {
        cart = new ShoppingCart();
    }
    @Test
    void incrementCounter() {
        cart.incrementCounter();
        assertEquals(1, cart.getCounter());
        cart.incrementCounter();
        assertEquals(2,cart.getCounter());
    }

    @Test
    void getCounter() {
        assertEquals(0, cart.getCounter());
        cart.incrementCounter();
        assertEquals(1, cart.getCounter());
    }

    @Test
    void addItem() {
        cart.addItem("bread");
        assertEquals("bread", cart.getItem().get(0));
        cart.addItem("condom");
        assertEquals("condom", cart.getItem().get(1));
    }

    @Test
    void addQuantity() {
        cart.addQuantity(3);
        assertEquals(3, cart.getQuantity().get(0));
        cart.addQuantity(4);
        assertEquals(4, cart.getQuantity().get(1));
    }

    @Test
    void addPricePerUnit() {
        cart.addPricePerUnit(500);
        assertEquals(500, cart.getPricePerUnit().get(0));
        cart.addPricePerUnit(1000);
        assertEquals(1000, cart.getPricePerUnit().get(1));
    }

    @Test
    void printSummary() {
    }

    @Test
    void discount() {
    }

    @Test
    void VATOnPrice() {
    }

    @Test
    void total() {
    }
}