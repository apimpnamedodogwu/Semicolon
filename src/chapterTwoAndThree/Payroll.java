package chapterTwoAndThree;

public class Payroll {

    public int taxOnIncome(int incomeTax, int grossIncome) {
        int taxInc = (incomeTax * grossIncome / 100);
        return taxInc;
    }

    public int professionalTaxOnIncome(int profTax, int grossIncome) {
        int profTaxInc = (profTax * grossIncome / 100);
        return profTaxInc;
    }

    public int publicProvidentFund(int pubProvFund, int grossIncome) {
        int provFund = (pubProvFund * grossIncome / 100);
        return provFund;
    }

    public int finalDeduction(int taxInc, int profTaxInc, int provFund) {
        int finDedc = taxInc + profTaxInc + provFund;
        return finDedc;
    }

    public int netIncome(int grossIncome, int finalDeduction) {
        int netInc = grossIncome - finalDeduction;
        return netInc;
    }
}
