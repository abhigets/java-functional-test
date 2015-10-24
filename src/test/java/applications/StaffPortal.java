package applications;

import pages.BasePage;
import pages.LoginPage;
import pages.staff.portal.StaffDashboardPage;
import pages.staff.portal.StaffInventoryPage;

import static org.junit.Assert.assertEquals;

public class StaffPortal extends BasePage{
    public StaffDashboardPage staffDashboardPage;
    public StaffInventoryPage staffInventoryPage;
    private LoginPage loginPage;

    private String staffEmail = "abhi.gets.mail@gmail.com";
    private String staffPassword = "abhi123";

    public StaffPortal() {
        staffDashboardPage = new StaffDashboardPage();
        staffInventoryPage = new StaffInventoryPage();
        loginPage = new LoginPage();
    }

    @Override
    public String getUrl() {
        return "http://localhost:9000/staff";
    }

    public void goToStaffPortal() {
        go();
        logInToClientApp();
    }

    public void logInToClientApp(){
        if (loginPage.isPresent()){
            loginPage.logInWith(staffEmail, staffPassword);
        }
    }
}
