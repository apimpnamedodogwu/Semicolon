package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.repositories.UserRepositoriesImplementation;
import africa.semicolon.truecaller.dtos.requests.RegisterRequest;
import africa.semicolon.truecaller.services.CMSExceptions.EmptyFieldException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplementationTest {
    UserServiceImplementation userServiceImplementation;
    UserRepositoriesImplementation userRepositoriesImplementation;
    RegisterRequest request;
    RegisterRequest requestTwo;
    @BeforeEach
    void setUserServiceImplementation() {
        request = new RegisterRequest();
        requestTwo = new RegisterRequest();
        userServiceImplementation = new UserServiceImplementation();

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
        assertThrows(EmptyFieldException.class,
                () -> request.setFirstName(""));
    }

}