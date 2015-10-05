package applications;

import pages.BasePage;
import static org.junit.Assert.*;
import pages.client.app.ClientDashboardPage;

public class ClientApp extends BasePage{
    public ClientDashboardPage clientDashboardPage;

    public ClientApp() {
        clientDashboardPage = new ClientDashboardPage();
    }

    public void verifyHeader(String pageHeader) {
        String actualPageHeader = find(".page-header").getText();
        assertEquals(pageHeader,actualPageHeader);
    }

    public void clickHomeButton() {
        click(".navbar-brand");
    }
}
