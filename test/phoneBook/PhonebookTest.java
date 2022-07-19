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
        assertEquals(1, phonebook.size());
    }
}