package chapterTwoAndThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculateInterestTest {
    @Test
    public void Interest() {
        CalculateInterestRate rate = new CalculateInterestRate();
        int result = rate.interestRate(300000, 4);
        assertEquals(result, 1000);
    }
}
