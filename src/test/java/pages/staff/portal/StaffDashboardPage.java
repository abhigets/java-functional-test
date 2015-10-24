package pages.staff.portal;

import pages.BasePage;

import java.util.concurrent.TimeUnit;

import static org.fluentlenium.core.filter.FilterConstructor.*;

public class StaffDashboardPage extends BasePage{
    public void openQuotation(String quotationName) {
        find("#quotations .list-group-item>a",withText(quotationName)).click();
    }

    public void clickCreateQuotation() {
        click(".btn-primary",withText("Create Quotation"));
    }

    public void clickVerifyQuote() {
        click("#verify-quotation");
    }

    public void clickSendToClient() {
        await().atMost(2, TimeUnit.SECONDS).until("#send-to-client").areDisplayed();
        click("#send-to-client");
        //await().atMost(3, TimeUnit.SECONDS).until("#send-to-client").areNotDisplayed();
    }

    public void clickViewQuotation() {
        click(".btn-primary",withText("View Quotation"));
    }

    public void clickAcceptQuotationForClientAndPlaceOrder() {
        click(".btn-success",withText("Accept Quotation for Client & Place Order"));
    }

    public void switchToOrderTab() {
        click(".nav-tabs a",withText("Orders"));
        await().atMost(2,TimeUnit.SECONDS).until("#orders .list-group-item a").areDisplayed();
    }

    public void openOrder(String orderName) {
        click("#orders .list-group-item a", withText(orderName));
    }

    public void clickApprovePayment() {
        submit("form button");
        await().atMost(3,TimeUnit.SECONDS).until(".row.top10 input").areDisplayed();
    }

    public void clickPlaceOrderInCorePass() {
        submit(".row.top10 input");
    }
}
