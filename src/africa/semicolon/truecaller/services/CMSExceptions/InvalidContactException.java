package africa.semicolon.truecaller.services.CMSExceptions;

public class InvalidContactException extends RuntimeException{
    public InvalidContactException (String message) {
        super(message);
    }
}
