package chapterSeven.turtleGraphics;

import static chapterSeven.turtleGraphics.Direction.*;

public class Turtle {
    private boolean isPenUp = true;
    private Direction currentDirection = EAST;
    private MyPosition myPosition = new MyPosition(0, 5);

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public void penUp() {
        isPenUp = true;
    }

    public Direction getCurrentLocation() {
        return currentDirection;
    }

    public void turnRight() {

        switch (currentDirection) {
            case EAST -> {
                currentDirection = SOUTH;
            }
            case SOUTH -> {
                currentDirection = WEST;
            }
            case WEST -> {
                currentDirection = NORTH;
            }
            case NORTH -> {
                currentDirection = EAST;
            }

        }
    }

    public void turnLeft() {

        switch (currentDirection) {
            case EAST -> {
                currentDirection = NORTH;
            }
            case NORTH-> {
                currentDirection = WEST;
            }
            case WEST -> {
                currentDirection = SOUTH;
            }
            case SOUTH -> {
                currentDirection = EAST;
            }

        }
    }

    public void move(int move) {

    }

    public MyPosition getMyPosition() {
        return myPosition;
    }
}

