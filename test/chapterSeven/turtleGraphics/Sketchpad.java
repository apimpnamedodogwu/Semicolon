package chapterSeven.turtleGraphics;

import java.util.Arrays;

public class Sketchpad {
    public int[][] floor;
    public Sketchpad(int length, int breadth) {
        floor = new int[length][breadth];
    }

    public int[][] getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        var s = "";
       for (int row =0; row < floor.length; row++){
           for (int column = 0; column < floor[row].length; column++){
               s += floor[row][column];
               s += " ";
           }
         s += "\n";
       }
       return s;
    }

    public void printFloor() {
        for (int i = 0; i < floor.length ; i++) {
            for (int j = 0; j < floor.length; j++) {
                if(floor[i][j]== 1){
                System.out.print("* ");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
