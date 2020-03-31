package exceptions;

public class AccessDeniedPleaseLoginException extends Exception {
    public AccessDeniedPleaseLoginException(String message) {
        super(message);
    }
}
