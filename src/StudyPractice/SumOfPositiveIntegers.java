package StudyPractice;

import java.util.Scanner;

public class SumOfPositiveIntegers {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        int number = 0;

        while (counter < 10) {
            System.out.println("Enter number: ");
            number = keyboard.nextInt();
            sum += number;
            counter += 1;

            if (number < 0) {
                System.out.println("Oops, try again.");
            }

        }
        System.out.printf("The sum is %d.%n", sum);
    }
}
