package chapterTwoAndThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompoundValueTest {
    @Test
    public void MonthValueTest() {
        CompoundValue myValue = new CompoundValue();
        int result = myValue.monthValueInterest(9000, 1);
        assertEquals(9000, result);
    }

    @Test
    public void CompoundValueTestTDD() {
        CompoundValue myValue = new CompoundValue();
        int result = myValue.compoundValueInterest(10000, 1, 9000);
        assertEquals(19000, result);
    }

}
