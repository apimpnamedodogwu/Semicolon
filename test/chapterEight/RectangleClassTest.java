package chapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleClassTest {

    RectangleClass myRectangle;

    @BeforeEach
    void setUp() {
        myRectangle = new RectangleClass();
    }

    @Test
    void testForPerimeter() {
        myRectangle.setLengthOfRectangle(10);
        myRectangle.setWidthOfRectangle(10);

        double result = myRectangle.calculatePerimeter();
        assertEquals(40, result);
    }

    @Test
    void testForArea() {
        myRectangle.setLengthOfRectangle(10);
        myRectangle.setWidthOfRectangle(10);

        double result = myRectangle.calculateArea();
        assertEquals(100, result);
    }
}