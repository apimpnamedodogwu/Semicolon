package chapterTwoAndThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductOfThreeIntegersTest {
    @Test
    public void Product() {
    ProductOfThreeIntegers multiply = new ProductOfThreeIntegers();
    Assertions.assertEquals(multiply.product(7,8,9), 504);
    }
}
