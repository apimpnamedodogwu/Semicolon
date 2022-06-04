package chapterTwo;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;

        Scanner digit = new Scanner(System.in);

        System.out.println("Input first integer ");
        firstNumber = digit.nextInt();

        System.out.println("Input second integer ");
        secondNumber = digit.nextInt();

        firstNumber = firstNumber * firstNumber;
        System.out.printf("The square is %d%n", firstNumber);

        secondNumber = secondNumber * secondNumber;
        System.out.printf("The square is %d%n", secondNumber);

        int sum = firstNumber + secondNumber;
        System.out.printf("The sum of the square is %d%n", sum);

        int diff = firstNumber - secondNumber;
        System.out.printf("The difference of the square is %d%n", diff);





    }
}
