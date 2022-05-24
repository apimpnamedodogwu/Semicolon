package chapterTwoAndThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {

    @Test

    public void ProductTest() {
        Arithmetic product = new Arithmetic();
        int result = product.productOfIntegers(7,9);
        assertEquals(63, result);
    }

    @Test
    public void DifferenceTest() {
        Arithmetic difference = new Arithmetic();
        Assertions.assertEquals(difference.differenceOfIntegers(10,4), 6);
    }

    @Test
    public void SumTest() {
        Arithmetic sum = new Arithmetic();
        Assertions.assertEquals(sum.sumOfIntegers(10,10), 20);
    }
}
