package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.Contact;
import africa.semicolon.truecaller.data.models.User;
import africa.semicolon.truecaller.data.repositories.UserRepositoriesImplementation;
import africa.semicolon.truecaller.dtos.requests.RegisterRequest;
import africa.semicolon.truecaller.services.CMSExceptions.EmptyFieldException;
import africa.semicolon.truecaller.services.CMSExceptions.InvalidContactException;
import africa.semicolon.truecaller.services.CMSExceptions.InvalidPasswordException;
import africa.semicolon.truecaller.services.CMSExceptions.InvalidPhoneNumberException;
import africa.semicolon.truecaller.services.validateRequest.ValidateRegisterRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceImplementationTest {
    UserServiceImplementation userServiceImplementation;
    RegisterRequest request;
    RegisterRequest requestTwo;
    Contact myContact;
    Contact myContactTwo;
    User myUser;

    @BeforeEach
    void setUserServiceImplementation() {
        request = new RegisterRequest();
        requestTwo = new RegisterRequest();
        userServiceImplementation = new UserServiceImplementation();
        myContact = new Contact();
        myContactTwo = new Contact();
        myUser = new User();
    }

    @Test
    void canRegister() {

        request.setFirstName("Eden");
        request.setLastName("Elenwoke");
        request.setEmail("eden.kwinesta@gmail.com");
        request.setPhoneNumber("08160577375");
        request.setPassword("12345678");
        userServiceImplementation.register(request);
        requestTwo.setFirstName("Daniel");
        requestTwo.setLastName("Elenwoke");
        requestTwo.setEmail("danielenwoke@gmail.com");
        requestTwo.setPhoneNumber("08121537524");
        requestTwo.setPassword("12345678");
        userServiceImplementation.register(requestTwo);
        assertEquals(2, userServiceImplementation.count());
    }

    @Test
    void registerThrows() {
        request.setFirstName("");
        request.setLastName("");
        assertThrows(EmptyFieldException.class,
                () -> userServiceImplementation.register(request));
        request.setFirstName("Eden");
        request.setLastName("Elenwoke");
        request.setEmail("");
        assertThrows(EmptyFieldException.class,
                () -> userServiceImplementation.register(request));
        request.setFirstName("Eden");
        request.setLastName("Elenwoke");
        request.setEmail("eden.kwinesta@gmail.com");
        request.setPhoneNumber("0816057737");
        assertThrows(InvalidPhoneNumberException.class,
                () -> userServiceImplementation.register(request));
        request.setFirstName("Eden");
        request.setLastName("Elenwoke");
        request.setEmail("eden.kwinesta@gmail.com");
        request.setPhoneNumber("08160577375");
        request.setPassword("12345");
        assertThrows(InvalidPasswordException.class,
                () -> userServiceImplementation.register(request));
        request.setFirstName("Eden");
        request.setLastName("Elenwoke");
        request.setEmail("eden.kwinesta@gmail.com");
        request.setPhoneNumber("08160577375");
        request.setPassword("12345678");
        userServiceImplementation.register(request);
        requestTwo.setFirstName("Daniel");
        requestTwo.setLastName("Elenwoke");
        requestTwo.setEmail("eden.kwinesta@gmail.com");
        requestTwo.setPhoneNumber("08121537524");
        requestTwo.setPassword("12345678");
        assertThrows(IllegalArgumentException.class,
                () -> userServiceImplementation.register(requestTwo));
    }

    @Test
    void testThatUserContactCanBeCreated() {
        request.setFirstName("Eden");
        request.setLastName("Elenwoke");
        request.setEmail("eden.kwinesta@gmail.com");
        request.setPhoneNumber("08160577375");
        request.setPassword("12345678");
        userServiceImplementation.register(request);
        User mikeUser = userServiceImplementation.findUser(1);
        myContact.setFirstName(request.getFirstName());
        myContact.setSecondName(request.getLastName());
        myContact.setEmail(request.getEmail());
        myContact.setPhoneNumber(request.getPhoneNumber());
        userServiceImplementation.createAUsersContact(myContact, mikeUser.getId());
        assertEquals(1, mikeUser.getContacts().size());
    }

    @Test
    void testThatUsersContactCanBeReturned() {
        request.setFirstName("Eden");
        request.setLastName("Elenwoke");
        request.setEmail("eden.kwinesta@gmail.com");
        request.setPhoneNumber("08160577375");
        request.setPassword("12345678");
        userServiceImplementation.register(request);
        User mikeUser = userServiceImplementation.findUser(1);
        myContact.setFirstName(request.getFirstName());
        myContact.setSecondName(request.getLastName());
        myContact.setEmail(request.getEmail());
        myContact.setPhoneNumber(request.getPhoneNumber());
        userServiceImplementation.createAUsersContact(myContact, mikeUser.getId());
        myContactTwo.setFirstName("Michael");
        myContactTwo.setSecondName(request.getLastName());
        myContactTwo.setEmail("michaelboyo@gmail.com");
        myContactTwo.setPhoneNumber("08038274399");
        userServiceImplementation.createAUsersContact(myContactTwo, mikeUser.getId());
        assertEquals(2, mikeUser.getContacts().size());
        var userContact = userServiceImplementation.getUsersContacts(1);
        assertEquals(myContactTwo.getEmail(), userContact.get(1).getEmail());

    }

    @Test
    void testThatUserCanDeleteContact() {
        request.setFirstName("Eden");
        request.setLastName("Elenwoke");
        request.setEmail("eden.kwinesta@gmail.com");
        request.setPhoneNumber("08160577375");
        request.setPassword("12345678");
        userServiceImplementation.register(request);
        User mikeUser = userServiceImplementation.findUser(1);
        myContact.setFirstName(request.getFirstName());
        myContact.setSecondName(request.getLastName());
        myContact.setEmail(request.getEmail());
        myContact.setPhoneNumber(request.getPhoneNumber());
        userServiceImplementation.createAUsersContact(myContact, mikeUser.getId());
        myContactTwo.setFirstName("Michael");
        myContactTwo.setSecondName(request.getLastName());
        myContactTwo.setEmail("michaelboyo@gmail.com");
        myContactTwo.setPhoneNumber("08038274399");
        userServiceImplementation.createAUsersContact(myContactTwo, mikeUser.getId());
        userServiceImplementation.deleteUsersContact(myContactTwo, mikeUser.getId());
        assertEquals(1, mikeUser.getContacts().size());
    }

    @Test
    void testThatDeleteExceptionIsThrown() {
        request.setFirstName("Eden");
        request.setLastName("Elenwoke");
        request.setEmail("eden.kwinesta@gmail.com");
        request.setPhoneNumber("08160577375");
        request.setPassword("12345678");
        userServiceImplementation.register(request);
        User mikeUser = userServiceImplementation.findUser(1);
        assertThrows(InvalidContactException.class,
                () -> userServiceImplementation.deleteUsersContact(myContactTwo, mikeUser.getId()));

    }
}