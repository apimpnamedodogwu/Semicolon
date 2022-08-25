
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexEmailTest {

    @Test
    void testThatAnEmailCanBeValid() {
        String email = "eden.kwinesta@gmail.com";
        var validated = RegexEmail.validateRequestEmail(email);
        assertTrue(validated);
    }

    @Test
    void testThatEmailExceptionIsThrownOne() {
        String email = "eden.kwinestagmail.com";
        assertThrows(RuntimeException.class,
                () -> RegexEmail.validateRequestEmail(email));
    }

    @Test
    void testThatEmailExceptionIsThrownTwo() {
        String email = "2eden.kwinestagmail.com";
        assertThrows(RuntimeException.class,
                () -> RegexEmail.validateRequestEmail(email));
    }

    @Test
    void testThatEmailExceptionIsThrownThree() {
        String email = "eden.kwinesta@gmail";
        assertThrows(RuntimeException.class,
                () -> RegexEmail.validateRequestEmail(email));
    }

    @Test
    void testThatEmailExceptionIsThrownFour() {
        String email = ".eden.kwinesta@gmail.com";
        assertThrows(RuntimeException.class,
                () -> RegexEmail.validateRequestEmail(email));
    }
}