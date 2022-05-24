package chapterTwoAndThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    @Test
    public void ConstructorTest() {
        Clock myClock = new Clock(9, 7, 5);
        int hour = myClock.getHour();
        int minute = myClock.getMinute();
        int second = myClock.getSecond();
        assertEquals(9, hour);
        assertEquals(7, minute);
        assertEquals(5, second);
    }

    @Test
    public void SetClock() {
        Clock myClock = new Clock(9, 7, 5);
        myClock.setHour(27);
        myClock.setMinute(54);
        myClock.setSecond(55);
        Assertions.assertEquals(0, myClock.getHour());
        Assertions.assertEquals(54, myClock.getMinute());
        Assertions.assertEquals(55, myClock.getSecond());

    }

    @Test
    public void DisplayTime() {
        Clock myClock = new Clock(9, 7, 5);
        myClock.setHour(22);
        myClock.setMinute(45);
        myClock.setSecond(55);
        String time = myClock.displayTime();
        assertEquals("22:45:55", time);
    }
}
