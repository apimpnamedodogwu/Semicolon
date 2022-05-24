package chapterTwoAndThree;

public class CalculateInterestRate {

    public int interestRate(int balance, int annualInterestRate) {
        int interest = balance * annualInterestRate / 1200;
        return interest;
    }
}
