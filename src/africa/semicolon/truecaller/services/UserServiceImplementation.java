package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.Contact;
import africa.semicolon.truecaller.data.models.User;
import africa.semicolon.truecaller.data.repositories.ContactRepositoriesImplement;
import africa.semicolon.truecaller.data.repositories.UserRepositoriesImplementation;
import africa.semicolon.truecaller.dtos.requests.RegisterRequest;
import africa.semicolon.truecaller.services.CMSExceptions.EmptyFieldException;
import africa.semicolon.truecaller.services.CMSExceptions.InvalidPasswordException;
import africa.semicolon.truecaller.services.CMSExceptions.InvalidPhoneNumberException;
import africa.semicolon.truecaller.services.validateRequest.ValidateRegisterRequest;

import java.util.Objects;

public class UserServiceImplementation implements UserService {
    ContactRepositoriesImplement contactRepositoriesImplement;
    UserRepositoriesImplementation userRepositoriesImplementation;
    ValidateRegisterRequest validateRegisterRequest;


    public UserServiceImplementation() {
        userRepositoriesImplementation = new UserRepositoriesImplementation();
        validateRegisterRequest = new ValidateRegisterRequest();
        contactRepositoriesImplement = new ContactRepositoriesImplement();
    }


    @Override
    public void register(RegisterRequest request) {

        validateRegisterRequest.validate(request);
        var existingEmail = userRepositoriesImplementation.findByEmail(request.getEmail());
        if (existingEmail == null) {
            User aUser = new User();
            aUser.setFirstName(request.getFirstName());
            aUser.setSecondName(request.getLastName());
            aUser.setPhoneNumber(request.getPhoneNumber());
            aUser.setEmail(request.getEmail());
            aUser.setPassword(request.getPassword());
            userRepositoriesImplementation.save(aUser);
        } else {
            throw new IllegalArgumentException(request.getEmail() + " already exists!");
        }
    }

    @Override
    public int count() {
        return userRepositoriesImplementation.count();
    }

    private Contact validateContact(Contact contact) {
        if (contact.getFirstName().isEmpty()) {
            throw new EmptyFieldException("First name cannot be blank!");
        }
        if (contact.getSecondName().isEmpty()) {
            throw new EmptyFieldException("Second name cannot be blank!");
        }
        if (contact.getPhoneNumber().length() != 11) {
            throw new InvalidPhoneNumberException(contact.getPhoneNumber() + " is invalid!");
        }
        if (contact.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be blank!");
        }
        return contact;
    }

    @Override
    public void createAUsersContact(Contact contact, int userId) {
        var user = userRepositoriesImplementation.findById(userId);
        var usersContactList = user.getContacts();
        var verifiedContact = validateContact(contact);
        for (Contact aContact : usersContactList) {
            if (Objects.equals(aContact.getEmail(), verifiedContact.getEmail())) {
                aContact.setFirstName(verifiedContact.getFirstName());
                aContact.setSecondName(verifiedContact.getSecondName());
                aContact.setPhoneNumber(verifiedContact.getPhoneNumber());
                aContact.setEmail(verifiedContact.getEmail());
                return;
            }
            usersContactList.add(contact);
            contactRepositoriesImplement.save(contact);
        }
    }
}
