package chapterFour;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);

        System.out.println("Enter base length of triangle here: ");
        int baseLength = myKeyboard.nextInt();

        if (baseLength < 1 || baseLength > 10) {
            System.out.println("Enter numbers between 1 - 10 please.");
        } else {
            for (int row = 1; row <= baseLength; row++) {
                for (int column = 1; column <= row; column++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
