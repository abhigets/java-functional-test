package applications;

import pages.BasePage;

import static org.junit.Assert.assertEquals;

/**
 * Created by abhi on 10/3/15.
 */
public class MobileCoreApp extends BasePage{



    public void verifyHeader(String pageHeader) {
        String actualPageHeader = find(".page-header").getText();
        assertEquals(pageHeader,actualPageHeader);
    }
}
