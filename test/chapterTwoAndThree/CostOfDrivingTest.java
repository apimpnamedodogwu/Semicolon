package chapterTwoAndThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CostOfDrivingTest {
    @Test
    public void Cost() {
        CostOfDriving aCar = new CostOfDriving();
        Assertions.assertEquals(aCar.costOfDriving(200, 20,5), 50);
    }
}
