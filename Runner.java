import typesOfUsers.Admin;
import typesOfUsers.User;
import typesOfUsers.Viewer;

public class Runner {

    public static void main(String[] args) {
        System.out.println("\n!First attempt to get access to the site with connected VPN!\n");
        Viewer viewer = new Viewer();
        viewer.setVpnConnected(false);
        viewer.getAccessToDashboard();
        viewer.setVpnConnected(true);
        viewer.getAccessToDashboard();

        System.out.println("\n!Second attempt to get access to the site with login and password!\n");
        User user = new User();
        user.setUsernameAndPassword(false);
        user.getAccessToDashboard();
        user.setUsernameAndPassword(true);
        user.setAccountActivated(false);
        user.getAccessToDashboard();

        System.out.println("\n!Third attempt to get access to the site without security code and remotely!\n");
        Admin admin = new Admin();
        admin.setRemoteAccessAttempt(true);
        admin.getAccessToDashboard();
        admin.setRemoteAccessAttempt(false);
        admin.setHasSecurityCode(false);
        admin.getAccessToDashboard();

    }
}
