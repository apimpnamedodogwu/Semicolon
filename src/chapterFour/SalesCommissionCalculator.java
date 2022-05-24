package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount of gross sales here or -1 to terminate: ");
        double grossSales = input.nextDouble();

        double stipend = 200;
        double percent = 0.09;

        while (grossSales != -1) {
            double salesCommission = stipend + (grossSales * percent);
            System.out.printf("Congratulations, you earned %.2f last week.%n", salesCommission);

            System.out.println("Enter amount of gross sales here or -1 to terminate: ");
            grossSales = input.nextDouble();

        }
    }
}
