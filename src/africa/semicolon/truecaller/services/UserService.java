package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.Contact;
import africa.semicolon.truecaller.data.models.User;
import africa.semicolon.truecaller.dtos.requests.RegisterRequest;

import java.util.List;

public interface UserService {

    void register(RegisterRequest request);
    int count();
    void createAUsersContact(Contact contact, int userId);

    User findUser(int id);
    List<Contact> getUsersContacts(int id);
    void deleteUsersContact(Contact contact, int userId);
}
