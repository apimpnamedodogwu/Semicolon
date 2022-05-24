package chapterTwoAndThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticSmallestAndLargestTest {

    @Test
    public void SumTest() {
        ArithmeticSmallestAndLargest sum = new ArithmeticSmallestAndLargest();
        Assertions.assertEquals(sum.sumOfNumbers(5,6,7), 18);
    }

    @Test
    public  void DiffTest() {
        ArithmeticSmallestAndLargest prod = new ArithmeticSmallestAndLargest();
        Assertions.assertEquals(prod.prodOfNumbers(5,6,7), 210);
    }

    @Test
    public  void AverageTest() {
        ArithmeticSmallestAndLargest avg = new ArithmeticSmallestAndLargest();
        Assertions.assertEquals(avg.avgOfNumbers(5,6,7), 6);
    }

    @Test
    public void SmallestTest() {
        ArithmeticSmallestAndLargest small = new ArithmeticSmallestAndLargest();
        Assertions.assertEquals(small.smallestNumber(5,9,2),2);
        Assertions.assertEquals(small.smallestNumber(1,6,8), 1);
        Assertions.assertEquals(small.smallestNumber(9,2,7),2);

    }
}
