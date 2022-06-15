package studyPractice.studyPracticeChapterSix;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter three numbers here: ");
        double first = myScanner.nextDouble();
        double second = myScanner.nextDouble();
        double third = myScanner.nextDouble();

       double result = Math.max(first, Math.max(second, third));
//     double result = max(first, second, third);
        System.out.println("The largest number is " + result);

    }

    public static double max(double x, double y, double z) {
        double largest = x;
        if (y > largest) {
            largest = y;
        }

        if (z > largest) {
            largest = z;
        }
        return largest;
    }
}
