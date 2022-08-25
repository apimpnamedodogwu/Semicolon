import java.util.regex.Pattern;

public class RegexEmail {
    private static final String pattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";

    public static boolean validateRequestEmail(String email) {
        var validatedEmail = Pattern.compile(pattern)
                .matcher(email)
                .matches();
        if (validatedEmail) {
            System.out.println(email + " is a valid email!");
            return true;
        }
        throw new RuntimeException(email + " is invalid!");
    }

    public static void main(String[] args) {
        String email = "eden.kwinesta@gmail.com";
        validateRequestEmail(email);
    }

}
