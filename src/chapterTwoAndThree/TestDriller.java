package chapterTwoAndThree;

public class TestDriller {


    public int product(int numberOfCopies) {
        if (numberOfCopies >= 1 && numberOfCopies <= 4) return  numberOfCopies * 2000;
        if (numberOfCopies >= 5 && numberOfCopies <= 9) return numberOfCopies * 1800;
        if (numberOfCopies >= 10 && numberOfCopies <=29) return numberOfCopies * 1600;
        if (numberOfCopies >= 30 && numberOfCopies <=49) return numberOfCopies * 1500;
        if (numberOfCopies >= 50 && numberOfCopies <= 99) return numberOfCopies * 1300;
        if (numberOfCopies >= 100 && numberOfCopies <= 199) return numberOfCopies * 1200;
        if (numberOfCopies >= 200 && numberOfCopies <= 499) return numberOfCopies * 1100;
        return  numberOfCopies * 1000;

    }
}
