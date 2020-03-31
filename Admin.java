import exceptions.CouldNotGetAnyResponceException;
import exceptions.ForbiddenException;

public class Admin extends User {

    private boolean hasSecurityCode;
    private boolean remoteAccessAttempt;

    public Admin() {
        super();
    }

    public void setHasSecurityCode(boolean hasSecurityCode) {
        this.hasSecurityCode = hasSecurityCode;
    }

    public void setRemoteAccessAttempt(boolean remoteAccessAttempt) {
        this.remoteAccessAttempt = remoteAccessAttempt;
    }

    @Override
    public void getAccessToDashboard() {
        try {
            goToTheMainPage();
            authentication();
        } catch (ForbiddenException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void authentication() throws ForbiddenException {
        if (remoteAccessAttempt) {
            throw new ForbiddenException("Could not get any response, this site can’t be reached.");
        }
        if (!hasSecurityCode) {
            throw new ForbiddenException("403 Forbidden");
        }
    }
}
