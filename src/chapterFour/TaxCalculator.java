package chapterFour;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int citizenCounter = 1;
        double taxRateOne = 0.15;
        double taxRateTwo = 0.20;

        while (citizenCounter <= 3) {
            System.out.println("Enter earnings here: ");
            int earnings = input.nextInt();
            citizenCounter = citizenCounter + 1;
            if (earnings <= 30000) {
                double tax = (double) earnings * taxRateOne;
                System.out.printf("Your tax is %.2f%n", tax);
            }

            if (earnings > 30000) {
                earnings = earnings - 30000;
                double taxV1 = (double) earnings * taxRateTwo;
                double taxV2 = 30000 * taxRateOne;
                double sum = taxV1 + taxV2;
                System.out.printf("Your total tax earning is %.2f%n", sum);
            }

        }
    }
}
