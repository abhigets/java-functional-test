package pages.staff.portal;

import domain.staff.portal.DistributionRecipientDetails;
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
        enterDistributionRecipientsDetails(new DistributionRecipientDetails());
        clickDistributeViaMail();
    }

    private void clickDistributeViaMail() {
        find(".panel-body .btn-primary").get(1).click();
    }

    private void enterDistributionRecipientsDetails(DistributionRecipientDetails distributionRecipientDetails) {
        fill(".form-control",withName("name_4_0")).with(distributionRecipientDetails.getName());
        fill(".form-control",withName("quantity_4_0")).with(distributionRecipientDetails.getQuantity());
        fill(".form-control",withName("email_4_0")).with(distributionRecipientDetails.getEmail());
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
