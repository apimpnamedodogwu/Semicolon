package chapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int rem;
        int rev = 0;


        Scanner keyboard = new Scanner(System.in);
        int numberLength = 0;
        int input = 0;
        int originalNumber = 0;
        while (numberLength != 5) {
            System.out.println("Enter a five digit number here: ");
            input = keyboard.nextInt();
            numberLength = Integer.toString(input).length();
            originalNumber = input;
        }


        while (input > 0) {
            rem = input % 10;
            rev = rev * 10 + rem;
            input /= 10;
        }


        if (originalNumber == rev) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }


    }
}
