package africa.semicolon.truecaller.data.repositories;

import africa.semicolon.truecaller.data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoriesImplementationTest {
    User myUser;
    User myUserTwo;
    UserRepositories userRepositories;

    @BeforeEach
    void setMyUser() {
        myUser = new User();
        myUserTwo = new User();
        userRepositories = new UserRepositoriesImplementation();
    }

    @Test
    void save() {
        myUser.setFirstName("Eden");
        myUser.setSecondName("Elenwoke");
        myUser.setEmail("eden.kwinesta@gmail.com");
        myUser.setPhoneNumber("08160577375");
        myUser.setAddress("10, Emily Akinola Street");
        userRepositories.save(myUser);
        assertEquals(1, userRepositories.count());
    }

    @Test
    void update() {
        myUser.setFirstName("Eden");
        myUser.setSecondName("Elenwoke");
        myUser.setEmail("eden.kwinesta@gmail.com");
        myUser.setPhoneNumber("08160577375");
        myUser.setAddress("10, Emily Akinola Street");
        userRepositories.save(myUser);
        myUser.setFirstName("Chimaraobim");
        userRepositories.save(myUser);
        assertEquals(1, userRepositories.count());
    }

    @Test
    void delete() {
        myUser.setFirstName("Eden");
        myUser.setSecondName("Elenwoke");
        myUser.setEmail("eden.kwinesta@gmail.com");
        myUser.setPhoneNumber("08160577375");
        myUser.setAddress("10, Emily Akinola Street");
        userRepositories.save(myUser);

        myUserTwo.setFirstName("Daniel");
        myUserTwo.setSecondName("Elenwoke");
        myUserTwo.setEmail("danielenwoke@gmail.com");
        myUserTwo.setPhoneNumber("08121537524");
        myUserTwo.setAddress("FUTO");
        userRepositories.save(myUserTwo);

        userRepositories.delete(myUserTwo);
        assertEquals(1, userRepositories.count());
    }

    @Test
    void deleteException() {
        assertThrows(IllegalArgumentException.class,
                () -> userRepositories.delete(myUserTwo));
    }

    @Test
    void testDelete() {
        myUser.setFirstName("Eden");
        myUser.setSecondName("Elenwoke");
        myUser.setEmail("eden.kwinesta@gmail.com");
        myUser.setPhoneNumber("08160577375");
        myUser.setAddress("10, Emily Akinola Street");
        userRepositories.save(myUser);

        myUserTwo.setFirstName("Daniel");
        myUserTwo.setSecondName("Elenwoke");
        myUserTwo.setEmail("danielenwoke@gmail.com");
        myUserTwo.setPhoneNumber("08121537524");
        myUserTwo.setAddress("FUTO");
        userRepositories.save(myUserTwo);

        userRepositories.delete(2);
        assertEquals(1, userRepositories.count());
    }

    @Test
    void findById() {
        myUserTwo.setFirstName("Daniel");
        myUserTwo.setSecondName("Elenwoke");
        myUserTwo.setEmail("danielenwoke@gmail.com");
        myUserTwo.setPhoneNumber("08121537524");
        myUserTwo.setAddress("FUTO");
        userRepositories.save(myUserTwo);
        userRepositories.findById(1);
        assertEquals("Daniel", myUserTwo.getFirstName());
    }

    @Test
    void findByFirstName() {
        myUserTwo.setFirstName("Daniel");
        myUserTwo.setSecondName("Elenwoke");
        myUserTwo.setEmail("danielenwoke@gmail.com");
        myUserTwo.setPhoneNumber("08121537524");
        myUserTwo.setAddress("FUTO");
        userRepositories.save(myUserTwo);

        assertEquals("Daniel", myUserTwo.getFirstName());
    }

    @Test
    void findByLastName() {
        myUserTwo.setFirstName("Daniel");
        myUserTwo.setSecondName("Elenwoke");
        myUserTwo.setEmail("danielenwoke@gmail.com");
        myUserTwo.setPhoneNumber("08121537524");
        myUserTwo.setAddress("FUTO");
        userRepositories.save(myUserTwo);
        myUser.setFirstName("Eden");
        myUser.setSecondName("Elenwoke");
        myUser.setEmail("eden.kwinesta@gmail.com");
        myUser.setPhoneNumber("08160577375");
        myUser.setAddress("10, Emily Akinola Street");
        userRepositories.save(myUser);

        assertEquals("Elenwoke", myUserTwo.getLastName());
        assertEquals(2, userRepositories.findByLastName("Elenwoke").size());
    }

    @Test
    void findAll() {
        myUser.setFirstName("Eden");
        myUser.setSecondName("Elenwoke");
        myUser.setEmail("eden.kwinesta@gmail.com");
        myUser.setPhoneNumber("08160577375");
        myUser.setAddress("10, Emily Akinola Street");
        userRepositories.save(myUser);

        myUserTwo.setFirstName("Daniel");
        myUserTwo.setSecondName("Elenwoke");
        myUserTwo.setEmail("danielenwoke@gmail.com");
        myUserTwo.setPhoneNumber("08121537524");
        myUserTwo.setAddress("FUTO");
        userRepositories.save(myUserTwo);


        assertEquals(2, userRepositories.count());
    }
}