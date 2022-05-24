package chapterTwoAndThree;

public class ArithmeticSmallestAndLargest {

    public int sumOfNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int sum = firstNumber + secondNumber + thirdNumber;
        return sum;
    }

    public int prodOfNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int prod = firstNumber * secondNumber * thirdNumber;
        return prod;
    }

    public int avgOfNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int avg = (firstNumber + secondNumber + thirdNumber) / 3;
        return avg;
    }

    public int smallestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int smallest = firstNumber;

        if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            smallest = secondNumber;
        }
        if (thirdNumber < firstNumber && thirdNumber < secondNumber) {
            smallest = thirdNumber;
        }
        return smallest;
    }
}






