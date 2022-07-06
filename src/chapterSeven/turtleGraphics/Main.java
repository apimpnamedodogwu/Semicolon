package chapterSeven.turtleGraphics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Turtle myTurtle = new Turtle();
        Sketchpad mySketch = new Sketchpad(20, 20);
        Scanner myKeyboard = new Scanner(System.in);
        int sent = 0;

        while (sent != -1) {
            System.out.println("""
                    1 -> turn right
                    2 -> turn left
                    3 -> to move
                    4 -> pen down
                    5 -> pen up
                    6 -> view sketchpad
                    0 -> quit
                    """);
            int userInput = myKeyboard.nextInt();
            switch (userInput) {
                case 1 -> myTurtle.turnRight();
                case 2 -> myTurtle.turnLeft();
                case 3 -> {
                    System.out.println("""
                            Enter steps here
                            """);
                    int moves = myKeyboard.nextInt();
                    myTurtle.move(moves, mySketch);
                }
                case 4 -> myTurtle.penDown();
                case 5 -> myTurtle.penUp();
                case 6 -> mySketch.printFloor();
                default -> sent = -1;
            }
        }


    }
}
