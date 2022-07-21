package africa.semicolon.truecaller.services.CMSExceptions;

public class InvalidPasswordException extends RuntimeException{
    public InvalidPasswordException (String message) {
        super(message);
    }
}
