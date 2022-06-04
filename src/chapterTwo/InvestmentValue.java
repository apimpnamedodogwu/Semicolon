package chapterTwo;

import java.util.Scanner;

public class InvestmentValue {

    public static void main(String[] args) {

        double investmentAmount;
        double annualInterestRate;
        double numberOfYears;
        double futureInvestmentValue;

        Scanner figure = new Scanner(System.in);

        System.out.println("Enter investment amount ");
        investmentAmount = figure.nextDouble();

        System.out.println("Enter annual interest rate in % ");
        annualInterestRate = figure.nextDouble();

        System.out.println("Enter number of years ");
        numberOfYears = figure.nextDouble();

        annualInterestRate = annualInterestRate / 100;

        futureInvestmentValue = investmentAmount * (1 + annualInterestRate) * numberOfYears;
        System.out.printf("Accumulated value is %f%n", futureInvestmentValue);


    }


}
