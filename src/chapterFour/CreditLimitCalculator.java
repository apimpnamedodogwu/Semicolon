package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int acctNumber = input.nextInt();
        System.out.println("Starting balance: ");
        int balance = input.nextInt();
        System.out.println("Total items charged: ");
        int debit = input.nextInt();
        System.out.println("Total of all credits applied: ");
        int credit = input.nextInt();
        System.out.println("Allowed credit limit: ");
        int creditLimit = input.nextInt();

        while (balance != -1) {
            int newBalance = (balance + debit - credit);
            System.out.printf("Your new balance is %d.%n", newBalance);
            if (newBalance > creditLimit) {
                System.out.println("You have exceeded your credit limit.");
            } else {
                System.out.println("You are still within your credit limit.");
            }
            System.out.println("Enter account number: ");
            acctNumber = input.nextInt();
            System.out.println("Starting balance: ");
            balance = input.nextInt();
            System.out.println("Total items charged: ");
            debit = input.nextInt();
            System.out.println("Total of all credits applied: ");
            credit = input.nextInt();
            System.out.println("Allowed credit limit: ");
            creditLimit = input.nextInt();
        }
    }
}

