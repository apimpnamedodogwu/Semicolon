package chapterTwoAndThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BodyMassIndexTest {
    @Test
    public void WeightInKilogramsTest() {
        BodyMassIndex bmi = new BodyMassIndex();
        double result = bmi.weightInkilo(80,0.454);
        assertEquals(36.32, result);
    }

    @Test
    public void HeightInMetres() {
        BodyMassIndex bmi = new BodyMassIndex();
        Assertions.assertEquals(bmi.heightInMetres(5,0.0254), 0.127);
    }

    @Test
    public void BMITest() {
        BodyMassIndex bmi = new BodyMassIndex();
        double bmiValue = bmi.bMI(36.32, 0.127);
        assertTrue(bmiValue >= 2251.8445);
    }

}
