package bankingApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
Customer myCustomer;

    @BeforeEach
    void setUp() {
        myCustomer = new Customer("Linda");
    }

    @Test
    void getCustomerId() {
        String Id = myCustomer.getCustomerId();
        assertNotNull(Id);
    }

    @Test
    void addAccount() {
        myCustomer.addAccount(new Account("1234", AccountType.DOMICILIARY));
        myCustomer.addAccount(new Account("2234", AccountType.CURRENT));
        ArrayList<Account> result = myCustomer.getAccount();
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    void customerDeposit() {
    }

    @Test
    void customerWithdraw() {
    }
}