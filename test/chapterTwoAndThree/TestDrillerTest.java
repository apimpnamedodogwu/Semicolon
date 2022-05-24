package chapterTwoAndThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {

    @Test

    public void totalPriceTestOneToFour() {
        TestDriller price = new TestDriller();
        int amountForCopies = price.product( 2);
        assertEquals(8000, amountForCopies);

    }

    @Test
    public void totalPriceTestFiveToNine() {
        TestDriller price = new TestDriller();
        int amountForCopies = price.product(9);
        assertEquals(16200, amountForCopies);
    }

    @Test
    public void totalPriceTestTenToTwentyNine() {
        TestDriller price = new TestDriller();
        int amountForCopies = price.product( 10);
        assertEquals(16000, amountForCopies);
    }

    @Test
    public void totalPriceTestThirtyToFortyNine() {
        TestDriller price = new TestDriller();
        int amountForCopies = price.product(49);
        assertEquals(73500, amountForCopies);
    }

    @Test
        public void totalPriceTestFiftyToNinetyNine() {
        TestDriller price = new TestDriller();
        int amountForCopies = price.product(50);
        assertEquals(65000, amountForCopies);
    }

    @Test
    public void totalPriceTestHundredToHundredAndNinetyNine() {
        TestDriller price = new TestDriller();
        int amountForCopies = price.product(100);
        assertEquals(120000, amountForCopies);
    }

    @Test
    public void totalPriceTestTwoHundredToFourHundredAndNinetyNine() {
        TestDriller price = new TestDriller();
        int amountForCopies = price.product(200);
        assertEquals(220000, amountForCopies);
    }

    @Test
    public void totalPriceTestFiveHundredAndAbove() {
        TestDriller price = new TestDriller();
        int amountForCopies = price.product(500);
        assertEquals(500000, amountForCopies);
    }














}



