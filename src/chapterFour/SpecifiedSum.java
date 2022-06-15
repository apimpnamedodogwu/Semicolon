package chapterFour;

import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int sum = 0;
        int input = 0;

        System.out.println("Enter number here: ");
        int value = myScanner.nextInt();

        while (value != input) {
            System.out.println("Enter number here: ");
            input = myScanner.nextInt();
            sum += input;
            if (sum > value || sum == value) {
                System.out.println("Done!");
                return;
            }
        }
    }

}

