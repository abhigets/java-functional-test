package steps.staff.portal;

import applications.ClientPortal;
import applications.StaffPortal;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class StaffPortalJourneySteps extends StaffPortal {
    @Then("^User navigates to staff portal$")
    public void user_navigate_to_staff_portal() throws Throwable {
        goToStaffPortal();
    }

    @And("^Staff creates a quotation for client$")
    public void Staff_creates_a_quotation_for_client() throws Throwable {
        staffDashboardPage.openQuotation(ClientPortal.recentQuotationName);
        staffDashboardPage.clickCreateQuotation();
        staffDashboardPage.clickVerifyQuote();
        staffDashboardPage.clickSendToClient();
    }

    @And("^Staff recreates a quotation for client$")
    public void Staff_recreates_a_quotation_for_client() throws Throwable {
        staffDashboardPage.openQuotation(ClientPortal.recentQuotationName);
        staffDashboardPage.clickViewQuotation();
        staffDashboardPage.clickVerifyQuote();
        staffDashboardPage.clickSendToClient();
    }

    @And("^Staff accepts quotation for client and places order$")
    public void Staff_accepts_quotation_for_client_and_places_order() throws Throwable {
        staffDashboardPage.openQuotation(ClientPortal.recentQuotationName);
        staffDashboardPage.clickViewQuotation();
        staffDashboardPage.clickAcceptQuotationForClientAndPlaceOrder();
    }

    @And("^Staff approves payment and places order in core pass$")
    public void Staff_approves_payment_and_places_order_in_core_pass() throws Throwable {
        staffDashboardPage.switchToOrderTab();
        staffDashboardPage.openOrder(ClientPortal.recentQuotationName);
        staffDashboardPage.clickApprovePayment();
        staffDashboardPage.clickPlaceOrderInCorePass();
    }

    @And("^Staff distributes orders through Inventory$")
    public void Staff_distributes_orders_through_Inventory() throws Throwable {
        staffInventoryPage.switchToInventoryPage();
        staffInventoryPage.viewInventoryForOrder();
        staffInventoryPage.distributeOrder();
    }
}
