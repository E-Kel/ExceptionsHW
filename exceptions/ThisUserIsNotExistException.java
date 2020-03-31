package exceptions;

public class ThisUserIsNotExistException extends AccessDeniedPleaseLoginException {
    public ThisUserIsNotExistException(String message){super(message);}
}
