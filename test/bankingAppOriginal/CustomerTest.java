package bankingAppOriginal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer myCustomer;

    @BeforeEach
    void setUp() {
        myCustomer = new Customer("Eden", Gender.NON_BINARY, 30);
    }

    @Test
    void getBVN() {
        int result = myCustomer.getBVN();
        assertEquals(1, result);
    }

    @Test
    void getName() {
        String name = myCustomer.getName();
        assertEquals("Eden", name);
    }

    @Test
    void getGender() {
        Gender gender = myCustomer.getGender();
        assertEquals(Gender.NON_BINARY, gender);
    }
}