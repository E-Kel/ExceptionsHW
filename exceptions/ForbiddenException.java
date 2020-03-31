package exceptions;

public class ForbiddenException extends CouldNotGetAnyResponceException {
    public ForbiddenException(String message) {
        super(message);
    }
}
