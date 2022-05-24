package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanComparisonTwoTest {
    BooleanComparisonTwo varComp;

    @BeforeEach
    void setUp() {
        varComp = new BooleanComparisonTwo();
    }

    @Test
    void TestComparisonMethod() {
        String[] firstArray = new String[10];
        firstArray[0] = "How are you?";
        firstArray[1] = "Are you a billionaire?";

        String[] secondArray = new String[10];
        secondArray[0] = "How are you?";
        secondArray[1] = "Are you a billionaire?";

        boolean result = varComp.comparisonTwo(firstArray, secondArray);
        assertTrue(result);

        String[] thirdArray = new String[10];
        thirdArray[0] = "Java no go kill me,";

        String[] fourthArray = new String[5];
        fourthArray[0] = "Na me go kill am.";

        boolean resultTwo = varComp.comparisonTwo(thirdArray, fourthArray);
        assertFalse(resultTwo);
    }

}