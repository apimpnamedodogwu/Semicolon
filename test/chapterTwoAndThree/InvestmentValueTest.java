package chapterTwoAndThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvestmentValueTest {
    @Test
    public void InvestmentValue() {
        InvestmentValue ego = new InvestmentValue();
        Assertions.assertEquals(ego.valueOnMoney(5000,5,5), 25000);
    }
}
