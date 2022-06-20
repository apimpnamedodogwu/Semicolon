package chapterSeven.turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.text.Position;

import static chapterSeven.turtleGraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle myTurtle;

    @BeforeEach
    void setUp() {
        myTurtle = new Turtle();
    }

    @Test
    void isPenUp() {
        myTurtle.penUp();
        assertTrue(myTurtle.isPenUp());
    }

    @Test
    void isPenDown() {
        myTurtle.penDown();
        assertFalse(myTurtle.isPenUp());

    }

    @Test
    void testThatPenCanGoUpAndDown() {
        myTurtle.penDown();
        assertFalse(myTurtle.isPenUp());
        myTurtle.penUp();
        assertTrue(myTurtle.isPenUp());

    }

    @Test
    void testThatTurtleCanTurnRight() {
        assertSame(EAST, myTurtle.getCurrentLocation());
        myTurtle.turnRight();
        assertSame(SOUTH, myTurtle.getCurrentLocation());
        myTurtle.turnRight();
        assertSame(WEST, myTurtle.getCurrentLocation());
        myTurtle.turnRight();
        assertSame(NORTH, myTurtle.getCurrentLocation());
        myTurtle.turnRight();
        assertSame(EAST, myTurtle.getCurrentLocation());
    }

    @Test
    void testThatTurtleCanLeft() {
        assertSame(EAST, myTurtle.getCurrentLocation());
        myTurtle.turnLeft();
        assertSame(NORTH, myTurtle.getCurrentLocation());
        myTurtle.turnLeft();
        assertSame(WEST, myTurtle.getCurrentLocation());
        myTurtle.turnLeft();
        assertSame(SOUTH, myTurtle.getCurrentLocation());
        myTurtle.turnLeft();
        assertSame(EAST, myTurtle.getCurrentLocation());
    }

    @Test
    void testThatTurtleCanMoveForward() {
        assertSame(EAST, myTurtle.getCurrentLocation());
        myTurtle.move(5);
        assertEquals(new MyPosition(0, 5), myTurtle.getMyPosition());

    }
}