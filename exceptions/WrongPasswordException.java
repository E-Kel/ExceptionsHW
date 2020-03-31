package exceptions;

public class WrongPasswordException extends AccessDeniedPleaseLoginException {
    public WrongPasswordException(String message){super(message);}
}
