package chapterTwo;

import java.util.Scanner;

public class CompoundValue {

    public static void main(String[] args) {

        double monthlyDeposit;

        Scanner amount = new Scanner(System.in);

        System.out.println("Enter monthly saving amount ");
        monthlyDeposit = amount.nextDouble();

        double monthlyInterestRate = 0.00417;

        double firstMonth = monthlyDeposit * (1 + monthlyInterestRate);

        double secondMonth = (monthlyDeposit + firstMonth) * (1 + monthlyInterestRate);

        double thirdMonth = (monthlyDeposit + secondMonth) * (1 + monthlyInterestRate);

        double fourthMonth = (monthlyDeposit + thirdMonth) * (1 + monthlyInterestRate);

        double fifthMonth = (monthlyDeposit + fourthMonth) * (1 + monthlyInterestRate);

        double sixthMonth = (monthlyDeposit + fifthMonth) * (1 + monthlyInterestRate);


        System.out.printf("value %f%n ", sixthMonth);

    }

}
