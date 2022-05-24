package chapterTwoAndThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayrollTest {
    @Test
    public void IncomeTax() {
        Payroll amount = new Payroll();
        Assertions.assertEquals(amount.taxOnIncome(5, 40000), 2000);
    }

    @Test
    public void ProfessionalTax() {
        Payroll amount = new Payroll();
        Assertions.assertEquals(amount.professionalTaxOnIncome(2, 40000), 800);
    }

    @Test
    public void PublicProvidentFund() {
        Payroll amount = new Payroll();
        Assertions.assertEquals(amount.publicProvidentFund(6, 40000), 2400);
    }

    @Test
    public void FinalDeduction() {
        Payroll amount = new Payroll();
        Assertions.assertEquals(amount.finalDeduction(2000, 800, 2400), 5200);
    }

    @Test
    public void NetIncome() {
        Payroll amount = new Payroll();
        Assertions.assertEquals(amount.netIncome(40000, 5200), 34800);
    }
}


