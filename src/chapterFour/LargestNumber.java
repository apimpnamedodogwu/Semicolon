package chapterFour;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int countNumber = 1;
        int number = 0;
        int largest;


        Scanner input = new Scanner(System.in);
        largest = number;

        while (countNumber <= 10) {
            System.out.println("Enter number here: ");
            number = input.nextInt();
            countNumber = countNumber + 1;

            if (number > largest) {
                largest = number;
            }
        }
        System.out.printf("%d is the largest number.", largest);
    }
}
