package steps.client.portal;

import applications.ClientPortal;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import domain.client.portal.VoucherSet;

import java.util.List;

public class ClientPortalJourneySteps extends ClientPortal {
    /*zzzzzzzzzAfter{
        quitBrowser();
    }*/

    @Given("^User navigate to client portal$")
    public void user_navigate_to_client_portal() throws Throwable {
        goToClientApp();
    }

    @When("^User chooses to create a new quotation$")
    public void User_chooses_to_create_a_new_quotation() throws Throwable {
        clientDashboardPage.clickCreateNewQuotationButton();
    }

    @And("^User enter quotation title as \"([^\"]*)\"$")
    public void User_enter_quotation_title_as(String quoteTitle) throws Throwable {
        clientDashboardPage.enterQuotationTitle(quoteTitle);
    }

    @And("^User enter following voucher set details:$")
    public void User_enter_following_voucher_set_details(List<VoucherSet> voucherSetList) throws Throwable {
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

    @And("^Client chooses to create a new quotation where delivery mechanism is SMS & EMAIL$")
    public void User_chooses_to_create_a_new_quotation_where_delivery_mechanism_is_SMS_EMAIL() throws Throwable {

        clientDashboardPage.clickCreateNewQuotationButton();
        clientDashboardPage.enterQuotationTitle("Quotation with delivery mechanism is sms and email");
        clientDashboardPage.enterVoucherSetWith(1, new VoucherSet().setDenominationQuantity("10"));
        clientDashboardPage.clickNext();
        clientDashboardPage.selectDeliveryMechanismSmsAndEmail();
        clientDashboardPage.selectDistributeThroClientPortal();
        clientDashboardPage.clickNext();
        clientDashboardPage.clickRequestForQuote();
    }

    @And("^Client rejects a quotation$")
    public void Client_rejects_a_quotation() throws Throwable {
        clientDashboardPage.openQuotation("Quotation with delivery mechanism is sms and email");
        clientDashboardPage.viewQuotation();
        clientDashboardPage.rejectQuotation();
    }

    @And("^Client approves a quotation$")
    public void Client_approves_a_quotation() throws Throwable {
        clientDashboardPage.openQuotation("Quotation with delivery mechanism is sms and email");
        clientDashboardPage.viewQuotation();
    }

    @And("^Client upload invoice and payments details$")
    public void Client_upload_invoice_and_payments_details() throws Throwable {
        clientDashboardPage.switchToOrderTab();
        clientDashboardPage.openOrder("Quotation with delivery mechanism is sms and email");
        clientDashboardPage.fillPaymentDetailsAndUpdateIt();
    }
}
