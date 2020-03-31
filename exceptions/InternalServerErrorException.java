package exceptions;

public class InternalServerErrorException extends CouldNotGetAnyResponceException {
    public InternalServerErrorException(String message){super(message);}
}
