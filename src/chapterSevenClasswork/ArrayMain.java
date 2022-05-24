package chapterSevenClasswork;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
//
////        Array declaration one
//        int[] myArray = new int[10];
//
////        Array declaration one
//        int[] myArray2 = {1,2,3,4};
//
////        Array declaration three
//        String[] stringArray = new String[5];
//
//
////         Array declaration four
//        String[] stringArray2 = {"Hello", "How are you"};
//
//        System.out.println("My array at 0 is " + myArray[0]);
//        System.out.println("My array2 at 4 is " + myArray2[3]);
////        myArray2[2] = 45;
//        For loops are for iterating through the arrays

        int sum = 0;
        int max;
        int min;
        int avg;
        int[] anArray = new int[5];
        anArray[0] = 10;
        anArray[1] = 20;
        anArray[2] = 33;
        anArray[3] = -6;
        anArray[4] = -7;
        max = anArray[0];
        min = anArray[0];
        avg = 0;


        for (int varForIndex = 0; varForIndex < anArray.length; varForIndex++) {

            sum += anArray[varForIndex];;

            avg = sum / anArray.length;

            if (anArray[varForIndex] > max) {
                max = anArray[varForIndex];
            }
            if (anArray[varForIndex] < min) {
                min = anArray[varForIndex];
            }
        }

        System.out.println("The sum is " + sum);
        System.out.println("The maximum is " + max);
        System.out.println("THE minimum is " + min);
        System.out.println("The average is " + avg);

        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter index");
            int index = s.nextInt();
            int a = anArray[index];
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Only index 0 to 4 allowed");
        }

    }
}
