//package bankingApp;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AccountTest {
//    Account myAccount;
//
//    @BeforeEach
//    void setUp() {
//        myAccount = new Account("1234", "Current");
//
//    }
//
//
//    @Test
//    void testThatAccountCanBeDepositedInto() {
//        myAccount.depositAmount(10000);
//        assertNotNull(myAccount);
//    }
//
//    @Test
//    void testThatAccountCanWithdrawWithTheCorrectPin() {
//        myAccount.depositAmount(5000);
//        myAccount.withdraw(1000, "1234");
//        double view = myAccount.viewBalance("1234");
//        boolean validate = myAccount.validatePin("1234");
//        assertEquals(4000, view);
//        assertTrue(validate);
//    }
//
//
//    @Test
//    void testThatWithdrawalLimitConditionIsMet() {
//        myAccount.depositAmount(400);
//        myAccount.withdraw(500, "1234");
//        double view = myAccount.viewBalance("1234");
//        boolean validate = myAccount.validatePin("1234");
//        assertEquals(400, view);
//        System.out.println("\n" + "Your balance is " + view);
//        assertTrue(validate);
//    }
//
//
//    @Test
//    void testThatAccountCannotWithdrawWithWrongPin() {
//        myAccount.depositAmount(5000);
//        myAccount.withdraw(1000, "4456");
//        double view = myAccount.viewBalance("4456");
//        boolean validate = myAccount.validatePin("4456");
//        assertEquals(5000, view);
//        assertFalse(validate);
//    }
//
//    @Test
//    void testThatAnAccountCanBeClosed() {
//
//
//    }
//
//    @Test
//    void testThatPinCanBeValidated() {
//        myAccount.viewBalance("1234");
//        boolean validate = myAccount.validatePin("1234");
//        assertTrue(validate);
//    }
//
//    @Test
//    void testThatPinCanBeValidatedTwo() {
//        myAccount.viewBalance("4456");
//        boolean validateTwo = myAccount.validatePin("4456");
//        assertFalse(validateTwo);
//    }
//
//    @Test
//    void testThatTransferCannotOccurWithWrongPin() {
//        myAccount.depositAmount(5000);
//        myAccount.transfer("4456", 1000);
//        double view = myAccount.viewBalance("4456");
//        assertEquals(5000, view);
//    }
//
//    @Test
//    void testThatTransferCanOccurWithCorrectPin() {
//        myAccount.depositAmount(5000);
//        myAccount.transfer("1234", 2000);
//        double view = myAccount.viewBalance("1234");
//        assertEquals(3000, view);
//    }
//
//    @Test
//    void testThatTransferCannotExceedBalanceLimit() {
//        myAccount.depositAmount(5000);
//        myAccount.transfer("1234", 10000);
//        double view = myAccount.viewBalance("1234");
//        assertEquals(5000, view);
//    }
//}