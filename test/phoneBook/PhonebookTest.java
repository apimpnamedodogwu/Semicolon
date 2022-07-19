package phoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookTest {
    Phonebook phonebook;

    @BeforeEach
    void setPhonebook() {
        phonebook = new Phonebook();
    }

    @Test
    void addContact() {
        phonebook.addContact("08160577375", "eden.kwinesta@mail.com");
        phonebook.addContact("08121537524", "eden.kwinesta@mail.com");
        assertEquals(2, phonebook.size());
    }

    @Test
    void addContactExceptionOne() {
        phonebook.addContact("08160577375", "eden.kwinesta@mail.com");
        assertThrows(PhonebookException.class,
                () -> phonebook.addContact("08160577375", "eden.kwinesta@mail.com"));
    }

    @Test
    void addContactExceptionTwo() {
        assertThrows(PhonebookException.class,
                () -> phonebook.addContact("09160577375", "eden.kwinesta@mail.com"));
        assertThrows(PhonebookException.class,
                () -> phonebook.addContact("0816057737", "eden.kwinesta@mail.com"));
    }
}