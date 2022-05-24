package chapterTwoAndThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        int result = calculator.add(2, 6);
        assertEquals(8, result);
    }

    @Test
    public void subtractTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(4, 2);
        assertEquals(2, result);
    }

    @Test
    public void absoluteSubtract(){
        Kata calculator = new Kata();
        int result = calculator.subtract(2, 4);
        assertEquals(2, result);
    }

    @Test
    public void multiplyTest(){
        Kata calculator = new Kata();
        int result = calculator.multiply(4, 4);
        assertEquals(16, result);
    }

    @Test

    public void quotientTest(){
        Kata calculator = new Kata();
        int result = calculator.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    public void newQuotientTest(){
        Kata calculator = new Kata();
        int result = calculator.division(6, 0);
        assertEquals(0, result);

    }



}