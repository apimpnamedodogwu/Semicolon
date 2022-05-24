package chapterTwoAndThree;

public class CompoundValue {

    public int monthValueInterest(int amount, int time) {
        time = 1;
        int interestRate = 5 / 100;
        int month = amount * (time + interestRate);
        return month;
    }

    public int compoundValueInterest(int amount, int time, int amntFrmPrevMnth) {
        time = 1;
        int interestRate = 5 / 100;
        int compoundInterest = (amount + amntFrmPrevMnth) * (time + interestRate);
        return compoundInterest;
    }

}
