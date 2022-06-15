package chapterFour;

import java.util.Scanner;

public class DecimalEquivalentOfABinaryNumber {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter numbers here: ");
        int number = myInput.nextInt();
        int div;
        int pV = 1;

            div = number % 10;
            int decEq = div * pV;
            pV *= 2;
            decEq += decEq;


    }
}
