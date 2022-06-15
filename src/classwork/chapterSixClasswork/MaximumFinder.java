package classwork.chapterSixClasswork;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter three double numbers: ");
        double numberOne = keyboard.nextDouble();
        double numberTwo = keyboard.nextDouble();
        double numberThree = keyboard.nextDouble();

        double result = maximum(numberOne, numberTwo, numberThree);

        System.out.print("Maximum number is" + result);
    }

    public static double maximum(double numberOne, double numberTwo, double numberThree) {
        double maximumValue = numberOne;

        if (numberTwo > numberOne) {
            maximumValue = numberTwo;
        }

        if (numberThree > numberTwo) {
            maximumValue = numberThree;
        }
        return maximumValue;
    }
}
