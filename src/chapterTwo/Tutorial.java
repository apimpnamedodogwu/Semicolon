package chapterTwo;

import java.util.Scanner;

public class Tutorial {
    public static void main(String[] args) {
    Scanner number = new Scanner(System.in);

    int numberOne;
    int numberTwo;

    System.out.println("Enter first number ");
    numberOne = number.nextInt();

    System.out.println("Enter second number ");
    numberTwo = number.nextInt();

    if (numberOne == numberTwo)
      System.out.printf("%d == %d%n", numberOne, numberTwo);

    if (numberOne < numberTwo)
        System.out.printf("%d < %d%n", numberOne, numberTwo);

    if (numberOne > numberTwo)
    System.out.printf("%d > %d", numberOne, numberTwo);
    }
}
