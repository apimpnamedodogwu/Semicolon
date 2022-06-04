package chapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number one ");
        int numberOne = input.nextInt();

        System.out.print("Enter number two ");
        int numberTwo = input.nextInt();

        System.out.print("Enter number three ");
        int numberThree = input.nextInt();


        int sum = numberOne + numberTwo + numberThree;
        System.out.printf("The sum is %d%n", sum);

        int product = numberOne * numberTwo * numberThree;
        System.out.printf("The product is %d%n", product);

        int average = (numberOne + numberTwo + numberThree) / 3;
        System.out.printf("The average is %d%n", average);


        int smallest = 0;
        int largest = 0;

        if  (numberOne < numberTwo &&  numberOne < numberThree)
            smallest = numberOne;

        if (numberTwo < numberOne && numberTwo < numberThree)
            smallest = numberTwo;

        if (numberThree < numberOne && numberThree < numberTwo)
            smallest = numberThree;

        System.out.printf("%d%n", smallest);

        if (numberOne > numberTwo && numberOne > numberThree)
            largest = numberOne;

        if (numberTwo > numberOne && numberTwo > numberThree)
            largest = numberTwo;

        if (numberThree > numberOne && numberThree > numberTwo)
            largest = numberThree;

        System.out.printf("%d%n", largest);




    }

}
