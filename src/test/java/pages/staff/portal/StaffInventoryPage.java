package pages.staff.portal;

import pages.BasePage;

import java.util.concurrent.TimeUnit;

import static org.fluentlenium.core.filter.FilterConstructor.*;

public class StaffInventoryPage extends BasePage{

    public void viewInventoryForOrder() {
        click(".glyphicon-eye-open");
        await().atMost(2,TimeUnit.SECONDS).until(".btn-primary").areDisplayed();
    }

    public void switchToInventoryPage() {
        click(".nav-sidebar a",withText("Inventory"));
        await().atMost(2, TimeUnit.SECONDS).until(".glyphicon-eye-open").areDisplayed();
    }

    public void distributeOrder() {
        clickDistribute();
        selectAllSetToDistribute();
        clickShowRecipientDetails();
    }

    private void clickShowRecipientDetails() {
        click("#show-recipient-details");
    }

    private void selectAllSetToDistribute() {
        click("#select-all");
    }

    private void clickDistribute() {
        click(".btn-primary");
    }
}
