package chapterSeven;
import java.util.Arrays;

public class BooleanComparison {

    public boolean Comparison(String[] firstArray, String[] secondArray) {

        for (int varFirstArray = 0; varFirstArray < firstArray.length; varFirstArray++) {
            System.out.println(firstArray[varFirstArray]);
        }
        for (int varSecondArray = 0; varSecondArray < secondArray.length; varSecondArray++) {
            System.out.println(secondArray[varSecondArray]);
        }
        boolean result = Arrays.equals(firstArray, secondArray);

        if(result) {
            return true;
        } else {
            return false;
        }
    }

}
