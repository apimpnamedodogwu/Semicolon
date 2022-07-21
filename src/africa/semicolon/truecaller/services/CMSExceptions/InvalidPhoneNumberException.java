package africa.semicolon.truecaller.services.CMSExceptions;

public class InvalidPhoneNumberException extends RuntimeException{
    public InvalidPhoneNumberException (String message) {
        super(message);
    }
}
