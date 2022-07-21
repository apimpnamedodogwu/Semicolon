package africa.semicolon.truecaller.services;

import africa.semicolon.truecaller.data.models.User;
import africa.semicolon.truecaller.data.repositories.ContactRepositoriesImplement;
import africa.semicolon.truecaller.data.repositories.UserRepositoriesImplementation;
import africa.semicolon.truecaller.dtos.requests.RegisterRequest;
import africa.semicolon.truecaller.services.CMSExceptions.EmptyFieldException;
import africa.semicolon.truecaller.services.CMSExceptions.InvalidPasswordException;
import africa.semicolon.truecaller.services.CMSExceptions.InvalidPhoneNumberException;
import africa.semicolon.truecaller.services.validateRequest.ValidateRegisterRequest;

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
}
