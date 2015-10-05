package steps.client.app;

import applications.ClientApp;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import domain.client.app.VoucherSet;

import java.util.List;

public class ClientAppJourneySteps extends ClientApp{
    /*After{
        quitBrowser();
    }*/

    @Given("^User navigate to client app$")
    public void user_navigate_to_client_app() throws Throwable {
        clientDashboardPage.goToClientApp();
    }

    @Then("^User should see Dashboard$")
    public void user_should_see_Dashboard() throws Throwable {
        verifyHeader("Dashboard");
    }

    @When("^User click on create a new quotation$")
    public void User_click_on_create_a_new_quotation() throws Throwable {
        clientDashboardPage.clickCreateNewQuotationButton();
    }

    @And("^User enter quotation title as \"([^\"]*)\"$")
    public void User_enter_quotation_title_as(String quoteTitle) throws Throwable {
        clientDashboardPage.enterQuotationTitle(quoteTitle);
    }

    @And("^User enter following set as :$")
    public void User_enter_following_set_as_(List<VoucherSet> voucherSetList) throws Throwable {
        int index = 0;
        for( VoucherSet currentVoucher : voucherSetList) {
            clientDashboardPage.enterVoucherSetWith(index, currentVoucher);
            index ++;
        }
        clientDashboardPage.clickNext();
    }

    @Given("^User is on home page$")
    public void User_is_on_home_page() throws Throwable {
        clickHomeButton();
    }
}
