package africa.semicolon.truecaller.services.validateRequest;

import africa.semicolon.truecaller.data.models.User;
import africa.semicolon.truecaller.dtos.requests.RegisterRequest;
import africa.semicolon.truecaller.services.CMSExceptions.EmptyFieldException;
import africa.semicolon.truecaller.services.CMSExceptions.InvalidPasswordException;
import africa.semicolon.truecaller.services.CMSExceptions.InvalidPhoneNumberException;

import java.util.Optional;

public class ValidateRegisterRequest {
    public boolean valPhoneNumber(String phoneNumber) {
        return phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1) == '8' && phoneNumber.length() == 11;
    }

    public boolean valPassword(String password) {
        return password.length() == 8;
    }

    public void validate(RegisterRequest request) {
        if (request.getFirstName().isEmpty()) {
            throw new EmptyFieldException("First name field cannot be empty!");
        }

        if (request.getLastName().isEmpty()) {
            throw new EmptyFieldException("Last name field cannot be empty!");
        }


        if (request.getEmail().isEmpty()) {
            throw new EmptyFieldException("Email field cannot be empty!");
        }

        if (!valPhoneNumber(request.getPhoneNumber())) {
            throw new InvalidPhoneNumberException(request.getPhoneNumber() + " is invalid!");
        }

        if (!valPassword(request.getPassword())) {
            throw new InvalidPasswordException(request.getPassword() + " is not up to eight digits!");
        }


    }
}
