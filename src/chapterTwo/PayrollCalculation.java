package chapterTwo;

import java.util.Scanner;

public class PayrollCalculation {

    public static void main(String[] args) {

        double grossIncome;
        double incomeTax;
        double professionalTax;
        double publicProvidentFund;


        Scanner amount = new Scanner(System.in);

        System.out.println("Enter gross income ");
        grossIncome = amount.nextDouble();

        System.out.println("Enter income tax in %");
        incomeTax = amount.nextDouble();

        System.out.println("Enter professional tax in % ");
        professionalTax = amount.nextDouble();

        System.out.println("Enter public provident fund in %");
        publicProvidentFund = amount.nextDouble();

        incomeTax = incomeTax * grossIncome / 100;
        professionalTax = professionalTax * grossIncome / 100;
        publicProvidentFund = publicProvidentFund * grossIncome / 100;

        double deductions = incomeTax + professionalTax + publicProvidentFund;

        double netIncome = grossIncome - deductions;

        System.out.printf("net income is %f", netIncome);


    }
}
