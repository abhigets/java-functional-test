package applications;

import pages.BasePage;

import static org.junit.Assert.assertEquals;

public class MobileCorePortal extends BasePage{

    //Hit the endpoint to clean database
    protected void cleanQuoteVouchersOrdersFromDB() {

    }

    public void verifyHeader(String pageHeader) {
        String actualPageHeader = find(".page-header").getText();
        assertEquals(pageHeader,actualPageHeader);
    }
}
