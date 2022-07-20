package phoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookTest {
    Phonebook phonebook;
    Contact myContact;
    Contact myContactThree;
    Contact myContactTwo;
    @BeforeEach
    void setPhonebook() {
        phonebook = new Phonebook();
        myContact = new Contact("Eden", "08160577375", "eden.kwinesta@gmail.com");
        myContactTwo = new Contact("Daniel", "08121537524", "danielenwoke@gmail.con");
        myContactThree = new Contact("Tallest", "08067945785", "tman@gmail.com");
    }

    @Test
    void addContact() {
        phonebook.addContact("08160577375", myContact);
        phonebook.addContact("08121537524", myContact);
        assertEquals(2, phonebook.size());
    }

    @Test
    void updateCheckOne() {
        phonebook.addContact("08160577375", myContact);
        phonebook.addContact("08160577375", myContact);
        assertEquals(1, phonebook.size());
    }

    @Test
    void updateCheckTwo() {
        phonebook.addContact("08160577375", myContact);
        myContact.setName("Love");
        var updateUser = phonebook.searchByPhoneNumber("08160577375");
        assertEquals(updateUser, myContact);
        assertEquals(1, phonebook.size());
    }


    @Test
    void addContactExceptionTwo() {
        assertThrows(PhonebookException.class,
                () -> phonebook.addContact("09160577375", myContact));
        assertThrows(PhonebookException.class,
                () -> phonebook.addContact("0816057737", myContact));
    }

    @Test
    void delete() {
        phonebook.addContact("08160577375", myContact);
        phonebook.deleteContact("08160577375");
        assertEquals(0, phonebook.size());
    }

    @Test
    void deleteException() {
        assertThrows(PhonebookException.class,
                () -> phonebook.deleteContact("08160577375"));
    }

    @Test
    void search() {
        phonebook.addContact("08160577375", myContact);
        phonebook.addContact("08121537524", myContactTwo);
        phonebook.addContact("08067945785", myContactThree);
        var user = phonebook.searchByPhoneNumber("08160577375");
        var userTwo = phonebook.searchByPhoneNumber("08121537524");
        assertEquals(myContact, user);
        assertEquals(myContactTwo, userTwo);
    }

    @Test
    void getContacts() {
        phonebook.addContact("08160577375", myContact);
        phonebook.addContact("08121537524", myContactTwo);
        phonebook.addContact("08067945785", myContactThree);
//        System.out.println(myContact);
        assertEquals(myContact, phonebook.getAllContacts().get("08160577375"));
    }

}