package chapterTwo;

import java.util.Scanner;
public class ProductOfThreeIntegers {
    public static void main(String[] args) {

        int numberOne;
        int numberTwo;
        int numberThree;

        Scanner input = new Scanner(System.in);



        System.out.println("Input first numeral ");
           numberOne = input.nextInt();

        System.out.println("Input second numeral ");
            numberTwo = input.nextInt();

        System.out.println("Input third numeral ");
            numberThree = input.nextInt();

           int product = numberOne * numberTwo * numberThree;
        System.out.printf("product is %d%n", product);


    }
}
