package applications;

import pages.BasePage;
import static org.junit.Assert.*;

import pages.LoginPage;
import pages.client.portal.ClientDashboardPage;

public class ClientPortal extends BasePage{
    public ClientDashboardPage clientDashboardPage;
    private LoginPage loginPage;

    private String clientEmail = "abhi.gets.mail@gmail.com";
    private String clientPassword = "abcd1234";

    public ClientPortal() {
        clientDashboardPage = new ClientDashboardPage();
        loginPage = new LoginPage();
    }

    @Override
    public String getUrl() {
        return "http://localhost:9000/client";
    }

    public void goToClientApp() {
        go();
        logInToClientApp();
    }

    public void logInToClientApp(){
        if (loginPage.isPresent()){
            loginPage.logInWith(clientEmail, clientPassword);
        }
    }

    public void clickHomeButton() {
        click(".navbar-brand");
        logInToClientApp();
    }

    public void verifyHeader(String pageHeader) {
        String actualPageHeader = find(".page-header").getText();
        assertEquals(pageHeader, actualPageHeader);
    }
}
