import exceptions.AccessDeniedPleaseLoginException;
import exceptions.CouldNotGetAnyResponceException;

public class Viewer {

    private boolean isVpnConnected;

    public void setVpnConnected(boolean vpnConnected) {
        isVpnConnected = vpnConnected;
    }

    public void getAccessToDashboard() {
        try {
            goToTheMainPage();
            authentication();
        } catch (CouldNotGetAnyResponceException | AccessDeniedPleaseLoginException e) {
            System.out.println(e.getMessage());
        }
    }

    protected void authentication() throws CouldNotGetAnyResponceException, AccessDeniedPleaseLoginException {
        if (!isVpnConnected)
            throw new CouldNotGetAnyResponceException("Could not get any response, this site can’t be reached.");
        if (isVpnConnected)
            throw new AccessDeniedPleaseLoginException("Access denied please login");
    }

    protected void goToTheMainPage() {
    }
}
