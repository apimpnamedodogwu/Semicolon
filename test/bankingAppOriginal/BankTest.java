package bankingAppOriginal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank myBank;


    @BeforeEach
    void setUp() {
        myBank = new Bank();

    }

    @Test
    void testThatAccountCanBeCreated() {
        myBank.createAccount("Eden", "1234", "1111", 1);
        assertEquals("1234", myBank.getAccounts().get(0).getPassword());
        assertEquals("Eden", myBank.getAccounts().get(0).getName());
        assertEquals("1111", myBank.getAccounts().get(0).getAccountNumber());
        assertEquals(1, myBank.getAccounts().get(0).getBVN());
        ArrayList<Account> result = myBank.getAccounts();
        assertEquals(1, result.size());

    }

    @Test
    void testThatAccountCanBeClosed() {
        myBank.createAccount("Eden", "1234", "1111", 1);
        myBank.closeAccount("1234", "1111");
        ArrayList<Account> result = myBank.getAccounts();
        assertEquals(0, result.size());
    }

    @Test
    void testThatExceptionMessageCanBeThrownInMethodCloseAccount() {
        assertThrows(IllegalArgumentException.class,
                () -> myBank.closeAccount("1234", "1111"));
    }


    @Test
    void testThatExceptionMessageCanBeThrownInMethodViewBalance() {
        assertThrows(IllegalArgumentException.class,
                () -> myBank.viewAccountBalance("1234", "1111"));
    }

    @Test
    void testThatAccountCanBeDepositedInto() {
        myBank.createAccount("Eden", "1234", "1111", 1);
        myBank.depositAmount(5000.0, "1111");
        double result = myBank.viewAccountBalance("1234", "1111");
        assertEquals(5000, result);
    }

    @Test
    void testThatAnInvalidAmountCannotBeDeposited() {
        myBank.createAccount("Eden", "1234", "1111", 1);
        assertThrows(BankException.class,
                () -> myBank.depositAmount(-1000, "1111"));
    }

    @Test
    void testThatAccountCanBeWithdrawnFrom() {
        myBank.createAccount("Eden", "1234", "1111", 1);
        myBank.depositAmount(5000, "1111");
        myBank.withdrawAmount(1000, "1234", "1111");
        double result = myBank.viewAccountBalance("1234", "1111");
        assertEquals(4000, result);
    }

    @Test
    void testThatWithdrawalLimitIsNotExceeded() {
        myBank.createAccount("Eden", "1234", "1111", 1);
        assertThrows(BankException.class,
                () -> myBank.withdrawAmount(10000, "1234", "1111"));
    }

    @Test
    void testThatACustomerHasAccounts() {
        myBank.createAccount("Eden", "1234", "1111", 1);
        myBank.createAccount("Eden", "1234", "2222", 1);
        myBank.createAccount("Boyo", "1212", "2211", 2);
        ArrayList<Account> result = myBank.getCustomerAccounts(1);
        assertEquals(2, result.size());
    }

    @Test
    void testThatExceptionMessageCanBeThrownInMethodGetCustomerAccount() {
        assertThrows(BankException.class,
                () -> myBank.getCustomerAccounts(1));
    }

    @Test
    void testThatTransferCanOccur() {
        myBank.createAccount("Eden", "1234", "1111", 1);
        myBank.createAccount("Grace", "1234", "2222", 2);
        myBank.depositAmount(5000, "1111");
        myBank.transferAmount(2000, "1234", "1111", "2222");
        double result = myBank.viewAccountBalance("1234", "1111");
        double resultTwo = myBank.viewAccountBalance("1234", "2222");
        assertEquals(3000, result);
        assertEquals(2000, resultTwo);
    }


    @Test
    void testThatExceptionMessageCanBeThrownInMethodTransfer() {
        myBank.createAccount("Eden", "1234", "1111", 1);
        myBank.depositAmount(5000, "1111");
        assertThrows(BankException.class,
                () -> myBank.transferAmount(2000, "1234", "1234", "2222"));
        var account = myBank.getAnAccount("1111");
        assertEquals(5000, account.getBalance());

    }

    @Test
    void testThatExceptionMessageCanBeThrownInMethodGetAnAccount() {
        assertThrows(BankException.class,
                () -> myBank.getAnAccount("1111"));
    }

    @Test
    void testThatCustomerListCanBeGotten() {
        myBank.registerACustomer("Eden", Gender.NON_BINARY, 29);
        ArrayList<Customer> customers = myBank.getCustomers();
        assertEquals(1, customers.size());
        assertEquals("Eden", myBank.getCustomers().get(0).getName());
        assertEquals(Gender.NON_BINARY, myBank.getCustomers().get(0).getGender());
        assertEquals(29, myBank.getCustomers().get(0).getAge());

    }


}