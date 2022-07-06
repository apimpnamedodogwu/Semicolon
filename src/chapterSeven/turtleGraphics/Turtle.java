package chapterSeven.turtleGraphics;

import static chapterSeven.turtleGraphics.Direction.*;

public class Turtle {
    private boolean isPenUp = true;
    private Direction currentDirection = EAST;
    private MyPosition myPosition = new MyPosition(0, 0);

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

    private void move(int steps) {
        switch (currentDirection) {
            case EAST -> increaseColumnBy(steps-1);
            case SOUTH -> increaseRowBy(steps-1);
            case WEST -> decreaseByColumn(steps-1);
            case NORTH -> decreaseRow(steps-1);
        }
    }

    public void move(int steps, Sketchpad sketchpad) {
        if (!isPenUp) draw(sketchpad, steps);
        move(steps);
    }

    private void draw(Sketchpad sketchpad, int steps) {
        int [][] floor = sketchpad.getFloor();
        int currentRow = myPosition.getRow();
        int currentColumn = myPosition.getColumn();
        try {
            switch (currentDirection) {
                case EAST -> {
                    for (int column = currentColumn; column < currentColumn + steps; column++) {
                        floor[currentRow][column] = 1;
                    }
                }
                case SOUTH -> {
                    for (int row = currentRow; row < currentColumn + steps; row++) {
                        floor[row][currentColumn] = 1;
                    }
                }
                case WEST -> {
                    var columnDestination = currentColumn - steps;
                    for (int column = currentColumn; column > columnDestination; column--) {
                        floor[currentRow][column] = 1;
                    }
                }
                case NORTH -> {
                    var rowDestination = currentRow - steps;
                    for (int row = currentRow; row > rowDestination; row--) {
                        floor[row][currentColumn] = 1;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }

    private void increaseColumnBy(int steps) {
        int currentColumn = myPosition.getColumn();
        myPosition.setColumnPosition(steps + currentColumn);
    }

    private void increaseRowBy(int steps) {
        int currentRow = myPosition.getRow();
        myPosition.setRowPosition(steps + currentRow);
    }

    private void decreaseByColumn(int steps) {
        int currentColumn = myPosition.getColumn();
        myPosition.setColumnPosition(currentColumn - steps);
    }

    private void decreaseRow(int steps) {
        int currentRow = myPosition.getRow();
        myPosition.setRowPosition(currentRow - steps);
    }

    public MyPosition getMyPosition() {
        return myPosition;
    }
}
