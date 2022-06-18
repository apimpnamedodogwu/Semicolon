package chapterFour;

import java.util.Scanner;

public class comparator {
    public static void main(String[] args) {

        int equal = 0;
        int firstGreater = 1;
        int secondGreater = -1;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int firstInput = myScanner.nextInt();
        System.out.println("Enter a number here: ");
        int secondInput = myScanner.nextInt();

        if (firstInput == secondInput) {
            System.out.println(equal);
        } else if (firstInput > secondInput) {
            System.out.println(firstGreater);
        } else {
            System.out.println(secondGreater);
        }

    }
}
