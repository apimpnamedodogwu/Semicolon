package studyPractice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input number here: ");
        int number = input.nextInt();

        for (int count = 0; count <= 12; ++count) {
            int result = number * count;
            System.out.printf("%d x %d = %d%n", number, count, result);
        }
    }
}
