import studyPractice.StudyPracticeChapterFive.AutoPolicy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoPolicyTest {
    @Test
    public void ConstructorTest() {
        AutoPolicy auto = new AutoPolicy(12345, "Toyota Camry", "Abia state");
        int acctNum = auto.getAccountNumber();
        String mAndM = auto.getMakeAndModel();
        String state = auto.getState();
        assertEquals(12345, acctNum);
        assertEquals("Toyota Camry", mAndM);
        assertEquals("Abia state", state);

    }

    @Test
    public void SetTest() {
        AutoPolicy auto = new AutoPolicy(12345, "Toyota Camry", "Abia state");
        auto.setAccountNumber(11223344);
        auto.setMakeAndModel("Nigerian made");
        auto.setState("Abia state");
        assertEquals(11223344, auto.getAccountNumber());
        assertEquals("Nigerian made", auto.getMakeAndModel());
        assertEquals("Abia state", auto.getState());
    }
}
