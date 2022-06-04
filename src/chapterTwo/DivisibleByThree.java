package chapterTwo;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {

        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number here ");
        num = input.nextInt();

        int divisibleThree = num % 3;

        if(divisibleThree == 0)
            System.out.println("This number is divisible by 3");

        if(divisibleThree != 0)
            System.out.println("This number is not divisible by 3");

    }
































}
