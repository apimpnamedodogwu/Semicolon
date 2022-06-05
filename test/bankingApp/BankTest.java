package bankingApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank myBank;

    @BeforeEach
    void setUp() {
        myBank = new Bank("1234");

    }

    @Test
    void testThatAnAccountCanBeCreated() {
        myBank.createAccount("current account", 500_000, "1234");
        assertNotNull(myBank);
    }

    @Test
    void testThatAccountCanBeDepositedInto() {
        myBank.depositAmount(10000);
        assertNotNull(myBank);
    }

    @Test
    void testThatAccountCanWithdrawWithTheCorrectPin() {
        myBank.depositAmount(5000);
        myBank.withdraw(1000, "1234");
        double view = myBank.viewBalance("1234");
        boolean validate = myBank.validatePin("1234");
        assertEquals(4000, view);
        assertTrue(validate);
    }


    @Test
    void testThatWithdrawalLimitConditionIsMet() {
        myBank.depositAmount(400);
        myBank.withdraw(500, "1234");
        double view = myBank.viewBalance("1234");
        boolean validate = myBank.validatePin("1234");
        assertEquals(400, view);
        System.out.println("\n" + "Your balance is " + view);
        assertTrue(validate);
    }


    @Test
    void testThatAccountCannotWithdrawWithWrongPin() {
        myBank.depositAmount(5000);
        myBank.withdraw(1000, "4456");
        double view = myBank.viewBalance("4456");
        boolean validate = myBank.validatePin("4456");
        assertEquals(5000, view);
        assertFalse(validate);
    }

    @Test
    void testThatAnAccountCanBeClosed() {


    }

    @Test
    void testThatPinCanBeValidated() {
        myBank.viewBalance("1234");
        boolean validate = myBank.validatePin("1234");
        assertTrue(validate);
    }

    @Test
    void testThatPinCanBeValidatedTwo() {
        myBank.viewBalance("4456");
        boolean validateTwo = myBank.validatePin("4456");
        assertFalse(validateTwo);
    }

    @Test
    void testThatTransferCannotOccurWithWrongPin() {
        myBank.depositAmount(5000);
        myBank.transfer("4456", 1000);
        double view = myBank.viewBalance("4456");
        assertEquals(5000, view);
    }

    @Test
    void testThatTransferCanOccurWithCorrectPin() {
        myBank.depositAmount(5000);
        myBank.transfer("1234", 2000);
        double view = myBank.viewBalance("1234");
        assertEquals(3000, view);
    }

    @Test
    void testThatTransferCannotExceedBalanceLimit() {
        myBank.depositAmount(5000);
        myBank.transfer("1234", 10000);
        double view = myBank.viewBalance("1234");
        assertEquals(5000, view);
    }
}