package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.Contact;
import africa.semicolon.truecaller.data.models.User;
import africa.semicolon.truecaller.data.repositories.UserRepositoriesImplementation;
import africa.semicolon.truecaller.dtos.requests.RegisterRequest;
import africa.semicolon.truecaller.services.CMSExceptions.EmptyFieldException;
import africa.semicolon.truecaller.services.CMSExceptions.InvalidPasswordException;
import africa.semicolon.truecaller.services.CMSExceptions.InvalidPhoneNumberException;
import africa.semicolon.truecaller.services.validateRequest.ValidateRegisterRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplementationTest {
    UserServiceImplementation userServiceImplementation;
    UserRepositoriesImplementation userRepositoriesImplementation;
    RegisterRequest request;
    RegisterRequest requestTwo;
    Contact myContact;
    User myUser;
    @BeforeEach
    void setUserServiceImplementation() {
        request = new RegisterRequest();
        requestTwo = new RegisterRequest();
        userServiceImplementation = new UserServiceImplementation();
        userRepositoriesImplementation = new UserRepositoriesImplementation();
        myContact = new Contact();
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
//            assertEquals(myUser, userRepositoriesImplementation.findById(1));
    }

}