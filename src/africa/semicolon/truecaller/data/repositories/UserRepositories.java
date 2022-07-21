package africa.semicolon.truecaller.data.repositories;

import africa.semicolon.truecaller.data.models.Contact;
import africa.semicolon.truecaller.data.models.User;

import java.util.List;
import java.util.Optional;

public interface UserRepositories {
    User save(User user);
    void delete(User user);
    void delete(int id);
    User findById(int id);
    List<User> findByFirstName(String firstName);
    List<User> findByLastName(String lastName);
    List<User> findAll();
    int count();
    User findByEmail(String email);
}
