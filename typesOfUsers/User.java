package typesOfUsers;

import exceptions.ForbiddenException;
import exceptions.InvalidCredentialsException;

public class User extends Viewer {
    private boolean usernameAndPassword;
    private boolean accountActivated;

    public User() {
        super();
    }

    public void setUsernameAndPassword(boolean usernameAndPassword) {
        this.usernameAndPassword = usernameAndPassword;
    }

    public void setAccountActivated(boolean accountActivated) {
        this.accountActivated = accountActivated;
    }

    @Override
    public void getAccessToDashboard() {
        try {
            goToTheMainPage();
            authentication();
        } catch (InvalidCredentialsException | ForbiddenException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void authentication() throws InvalidCredentialsException, ForbiddenException {
        if (!usernameAndPassword) {
            throw new InvalidCredentialsException("Invalid username or password");
        }
        if (!accountActivated)
            throw new ForbiddenException("403 Forbidden");
    }
}
