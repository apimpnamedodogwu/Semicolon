package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    ShoppingCart receipt;

    @BeforeEach
    void SetUp() {
        receipt = new ShoppingCart();
    }
    @Test
    void PriceTest() {
    double result = receipt.Price(4, 1000);
    assertEquals(4000, result);
    }

    @Test
    void DiscountTest() {
        double result = receipt.discount(4000, 10);
        assertEquals(400, result);
    }

    @Test
    void VATOnPriceTest() {
        double result = receipt.VATOnlPrice(12000.00);
        assertEquals(900, result);
    }

    @Test
    void TotalTest() {
        double result = receipt.Total(10, 10000);
        assertEquals(11750.00, result);
    }

}