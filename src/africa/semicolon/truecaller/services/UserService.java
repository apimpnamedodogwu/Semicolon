package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.Contact;
import africa.semicolon.truecaller.dtos.requests.RegisterRequest;

public interface UserService {

    void register(RegisterRequest request);
    int count();
    void createAUsersContact(Contact contact, int userId);
}
