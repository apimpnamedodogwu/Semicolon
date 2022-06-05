package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
        assertEquals(2, cart.getCounter());
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
        cart.addQuantity(10);
        cart.addPricePerUnit(500);
        cart.incrementCounter();
        double result = cart.discount(20);
        assertEquals(1000, result);
    }

    @Test
    void VATOnPrice() {
        cart.addQuantity(10);
        cart.addPricePerUnit(500);
        cart.incrementCounter();
        double result = cart.VATOnPrice();
        assertEquals(375, result);
    }

    @Test
    void total() {
        cart.addQuantity(10);
        cart.addPricePerUnit(500);
        cart.incrementCounter();
        double total = cart.Total();
        assertEquals(5000, total);
    }

    @Test
    void itemsCanBeRetrieved() {
        cart.addItem("Alienware");
        ArrayList<String> result = cart.getItem();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Alienware", cart.getItem().get(0));
    }

    @Test
    void quantityOfItemsCanBeRetrieved() {
        cart.addQuantity(10);
        ArrayList<Integer> result = cart.getQuantity();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(10, cart.getQuantity().get(0));
    }

    @Test
    void priceOfItemCanBeRetrieved() {
        cart.addPricePerUnit(500);
        ArrayList<Integer> result = cart.getPricePerUnit();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(500, cart.getPricePerUnit().get(0));
    }

    @Test
    void summaryCanPrint() {
        cart.addItem("phone");
        cart.addPricePerUnit(10);
        cart.addQuantity(10);
        String sum = cart.printSummary(0);
        assertEquals("phone     10     10     100", sum);

    }

}