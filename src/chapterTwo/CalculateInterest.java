package chapterTwo;

import java.util.Scanner;

public class CalculateInterest {

    public static void main(String[] args) {

        double interest;
        double balance;
        double annualInterestRate;

        Scanner amount = new Scanner(System.in);

        System.out.println("Enter balance and interest rate ");
        balance = amount.nextDouble();
        annualInterestRate = amount.nextDouble();

       interest = balance * (annualInterestRate / 1200);
       System.out.printf("The interest is %f%n", interest);
































    }






























}
