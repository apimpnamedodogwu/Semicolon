package chapterTwoAndThree;

public class InvestmentValue {
    public int valueOnMoney(int investmentAmount, int annualInterest, int numberOfYears) {
        annualInterest = annualInterest / 100;
        int futureInvestmentValue = investmentAmount * (1 + annualInterest) * numberOfYears;
        return futureInvestmentValue;

    }
}
