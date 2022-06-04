package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {

        Scanner nomba = new Scanner(System.in);

        System.out.print("Enter first number ");
        int numberOne = nomba.nextInt();

        System.out.print("Enter second number ");
        int numberTwo = nomba.nextInt();

        System.out.print("Enter third number ");
        int numberThree = nomba.nextInt();

        System.out.print("Enter fourth number ");
        int numberFour = nomba.nextInt();

        System.out.print("Enter fifth number ");
        int numberFive = nomba.nextInt();


        int largest = 0;
        int smallest = 0;

        if (numberOne > numberTwo && numberOne > numberThree && numberOne > numberFour && numberOne > numberFive)
            largest = numberOne;

        if (numberTwo > numberOne && numberTwo > numberThree && numberTwo > numberFour && numberTwo > numberFive)
            largest = numberTwo;

        if (numberThree > numberOne && numberThree > numberTwo && numberThree > numberFour && numberThree > numberFive)
            largest = numberThree;

        if (numberFour > numberOne && numberFour > numberTwo && numberFour > numberThree && numberFour > numberFive)
            largest = numberFour;

        if (numberFive > numberOne && numberFive > numberTwo && numberFive > numberThree && numberFive > numberFour)
            largest = numberFive;

        System.out.printf("%d%n", largest);

        if (numberOne < numberTwo && numberOne < numberThree && numberOne < numberFour && numberOne < numberFive)
            smallest = numberOne;

        if (numberTwo < numberOne && numberTwo < numberThree && numberTwo < numberFour && numberTwo < numberFive)
            smallest = numberTwo;

        if (numberThree < numberOne && numberThree < numberTwo && numberThree < numberFour && numberThree < numberFive)
            smallest = numberThree;

        if (numberFour < numberOne && numberFour < numberTwo && numberFour < numberThree && numberFour < numberFive)
            smallest = numberFour;

        if (numberFive < numberOne && numberFive < numberTwo && numberFive < numberThree && numberFive < numberFour)
            smallest = numberFive;


        System.out.printf("%d%n", smallest);

    }
}
