package chapterSeven;

public class BooleanComparisonTwo {

    public boolean comparisonTwo(String[] firstArray, String[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }
        for (int indexVariable = 0; indexVariable < firstArray.length; indexVariable++) {
            if (firstArray[indexVariable] != secondArray[indexVariable]) {
                return false;
            }
        }
        return true;
    }
}
