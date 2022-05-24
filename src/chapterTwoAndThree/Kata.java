package chapterTwoAndThree;

public class Kata {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNUmber, int secondNumber) {
        int difference = firstNUmber - secondNumber;
        if (secondNumber > firstNUmber) difference = secondNumber - firstNUmber;
        return difference;
    }

    public int multiply(int firstNumber, int secondNumber) {
        int product = firstNumber * secondNumber;
        return product;
    }


    public int divide(int firstNumber, int secondNumber) {
        int division = firstNumber / secondNumber;
        return division;
    }


    public int division(int numerator, int denominator) {
        if (denominator == 0) return  0;
        return  numerator / denominator;
    }
}

