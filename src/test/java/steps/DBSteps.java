package steps;

import applications.MobileCorePortal;
import cucumber.api.java.en.Given;


public class DBSteps extends MobileCorePortal {

    @Given("^All the quotation, orders and vochers are cleared from DB$")
    public void All_the_quotation_orders_and_vochers_are_cleared_from_DB() throws Throwable {
        cleanQuoteVouchersOrdersFromDB();
    }
}
