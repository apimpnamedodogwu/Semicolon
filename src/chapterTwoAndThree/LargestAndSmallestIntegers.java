package chapterTwoAndThree;

public class LargestAndSmallestIntegers {
    public int largestInteger(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber){
        int largest = firstNumber;

        if(secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber && secondNumber > fifthNumber){
            largest = secondNumber;
        }
        if(thirdNumber > firstNumber && thirdNumber > secondNumber && thirdNumber > fourthNumber && thirdNumber > fifthNumber){
            largest = thirdNumber;
        }

        if(fourthNumber > firstNumber && fourthNumber > secondNumber && fourthNumber > thirdNumber && fourthNumber > fifthNumber){
            largest = fourthNumber ;
        }

        if(fifthNumber > firstNumber && fifthNumber > secondNumber && fifthNumber > thirdNumber && fifthNumber > fourthNumber){
            largest = fifthNumber;
        }
        return largest;
    }

    public  int smallestInteger(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber){
        int smallest = firstNumber;
        if(secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber){
            smallest = secondNumber;
        }
        if(thirdNumber < firstNumber && thirdNumber < secondNumber && thirdNumber < fourthNumber && thirdNumber < fifthNumber){
            smallest = thirdNumber;
        }

        if(fourthNumber < firstNumber && fourthNumber < secondNumber && fourthNumber < thirdNumber && fourthNumber < fifthNumber){
            smallest = fourthNumber;
        }

        if(fifthNumber < firstNumber && fifthNumber < secondNumber && fifthNumber < thirdNumber && fifthNumber < fourthNumber){
            smallest = fifthNumber;
        }
        return smallest;
    }


}
