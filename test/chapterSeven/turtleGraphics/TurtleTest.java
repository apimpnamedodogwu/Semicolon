package chapterSeven.turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static chapterSeven.turtleGraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle myTurtle;
    Sketchpad sketchpad;

    @BeforeEach
    void setUp() {
        myTurtle = new Turtle();
        sketchpad = new Sketchpad(5, 5);
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
    void testThatTurtleCanMoveEast() {
        assertSame(EAST, myTurtle.getCurrentLocation());
        myTurtle.move(5, sketchpad);
        assertEquals(new MyPosition(0, 5), myTurtle.getMyPosition());
    }

    @Test
    void testThatTurtleCanMoveSouth() {
        myTurtle.turnRight();
        myTurtle.move(7, sketchpad);
        assertEquals(new MyPosition(7, 0), myTurtle.getMyPosition());
    }

    @Test
    void testThatColumnCanMoveNorth() {
        myTurtle.turnRight();
        myTurtle.move(2, sketchpad);
        assertEquals(SOUTH, myTurtle.getCurrentLocation());
        myTurtle.turnLeft();
        assertEquals(EAST, myTurtle.getCurrentLocation());
        myTurtle.turnLeft();
        myTurtle.move(2, sketchpad);
        assertEquals(new MyPosition(0, 0), myTurtle.getMyPosition());
    }

    @Test
    void testThatTurtleCanMoveWest() {
        myTurtle.move(2, sketchpad);
        myTurtle.turnRight();
        assertEquals(SOUTH, myTurtle.getCurrentLocation());
        myTurtle.move(2, sketchpad);
        myTurtle.turnRight();
        myTurtle.move(2, sketchpad);
        assertEquals(WEST, myTurtle.getCurrentLocation());
        assertEquals(new MyPosition(2, 0), myTurtle.getMyPosition());
    }

    @Test
    void testThatTurtleCanDraw() {
       myTurtle.penDown();
       myTurtle.move(5, sketchpad);
       myTurtle.turnRight();
       assertEquals(SOUTH, myTurtle.getCurrentLocation());
       myTurtle.move(5, sketchpad);
       myTurtle.turnRight();
       assertEquals(WEST, myTurtle.getCurrentLocation());
       myTurtle.move(5, sketchpad);
       myTurtle.turnRight();
       assertEquals(NORTH, myTurtle.getCurrentLocation());
       myTurtle.move(5, sketchpad);

        for (int column = 0; column < 5; column++) {
            assertEquals(1, sketchpad.getFloor()[0][column]);
        }
        for (int row = 0; row < 5; row ++){
            assertEquals(1, sketchpad.getFloor()[row][4]);
        }
        for (int column = 4; column >= 0; column--) {
            assertEquals(1, sketchpad.getFloor()[4][column]);
        }
        for (int row = 4; row >= 0 ; row--) {
            assertEquals(1, sketchpad.getFloor()[row][4]);
        }
        System.out.println(sketchpad);

    }
}