package chapterFour;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        int countNumber = 1;
        int number = 0;
        int firstLargest;
        int secondLargest = 0;

        Scanner input = new Scanner(System.in);
        firstLargest = number;

        while (countNumber <= 10) {
            System.out.println("Enter number here: ");
            number = input.nextInt();
            countNumber = countNumber + 1;
            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            }
        }
        System.out.printf("%d and %d.%n", secondLargest, firstLargest);


    }
}

