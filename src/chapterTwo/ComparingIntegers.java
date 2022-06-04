package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {

        Scanner integer = new Scanner(System.in);

        System.out.println("Enter number here ");
        int number = integer.nextInt();

        if (number > 100)
        {System.out.printf ("%d > %d%n", number, 100);}

        if (number * number > 100)
        {System.out.printf("%d > %d%n", number, 100);}

        if (number == 100)
        {System.out.printf("%d == %d%n", number, 100);}

        if (number * number == 100)
        {System.out.printf("%d == %d%n", number, 100);}

        if (number != 100)
        {System.out.printf("%d != %d%n", number, 100);}

        if (number * number != 100)
        {System.out.printf("%d != %d%n", number, 100);}

        if (number < 100)
        {System.out.printf("%d < %d%n", number, 100);}

        if (number * number < 100)
        {System.out.printf("%d < %d%n", number, 100);}

    }
}
