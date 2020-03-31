package exceptions;

public class InvalidCredentialsException extends AccessDeniedPleaseLoginException {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
