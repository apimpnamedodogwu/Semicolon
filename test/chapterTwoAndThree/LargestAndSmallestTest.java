package chapterTwoAndThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LargestAndSmallestTest {
    @Test
    public void LargestTest(){
        LargestAndSmallestIntegers myInt = new LargestAndSmallestIntegers();
        int result = myInt.largestInteger(5, 9,4,6,2);
        assertEquals(9, result);
    }

    @Test
    public void SmallestTest(){
        LargestAndSmallestIntegers myInt = new LargestAndSmallestIntegers();
        int result = myInt.smallestInteger(7,9,4,9,0);
        assertEquals(0, result);
    }

}
