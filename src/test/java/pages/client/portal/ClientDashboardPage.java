package pages.client.portal;

import static org.fluentlenium.core.filter.FilterConstructor.*;

import domain.client.portal.VoucherSet;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class ClientDashboardPage extends BasePage {

    public void clickCreateNewQuotationButton() {
        click(".btn-primary", withText("CREATE NEW QUOTATION +"));
    }

    public void clickNext() {
        click(".actions a",withText("Next"));
    }

    public void enterVoucherSetWith(int index, VoucherSet voucherSet) {
        //IF there are more then one vouchers then 'Add New Set'
        if (index > 1)
            click("#new-booklet-config");

        enterVoucherSetName(index-1,voucherSet.getName());
        enterVoucherSetQuantity(index-1, voucherSet.getQuantity());
        enterVoucherSetDenomination(index-1, voucherSet.getDenomination());
        enterVoucherSetDenominationQuantity(index - 1, voucherSet.getDenominationQuantity());
    }

    private void enterVoucherSetDenominationQuantity(int index, String voucherSetDenominationQuantity) {
        fill(".form-control",withName("quantity-"+index+"-0")).with(voucherSetDenominationQuantity);
    }

    private void enterVoucherSetDenomination(int index, String voucherSetDenomination) {
        fill(".form-control",withName("faceValue-"+index +"-0")).with(voucherSetDenomination);
    }

    private void enterVoucherSetQuantity(int index, String voucherSetQuantity) {
        fill(".form-control",withName("bgcQuantity-"+index)).with(voucherSetQuantity);
    }

    private void enterVoucherSetName(int index,String voucherSetName) {
        fill(".form-control",withName("bgcName-"+index)).with(voucherSetName);
    }

    public void enterQuotationTitle(String quoteTitle) {
        fill(".form-control",withName("name")).with(quoteTitle);
    }

    public void selectDeliveryMechanismSmsAndEmail(){
        find("#distribution-details .col-md-1>input").get(2).click();
    }

    public void selectDistributeThroClientPortal(){
        find(".radio>label>input").get(0).click();
    }

    public void clickRequestForQuote() {
        click("#quotation-submit-button");
        getDriver().switchTo().alert().accept();
    }

    public void openQuotation(String quotationName) {
        click("#quotations .list-group-item>a", withText(quotationName));
    }

    public void viewQuotation() {
        click(".description-detail>a",withText("View"));
    }

    public void rejectQuotation() {
        await().atMost(2, TimeUnit.SECONDS).until("#reject-quotation").areDisplayed();
        click("#reject-quotation");
        //await().atMost(3, TimeUnit.SECONDS).until("#reject-quotation").areNotDisplayed();
    }

    public void switchToOrderTab() {
        click(".nav-tabs a",withText("Manage Orders"));
        await().atMost(2,TimeUnit.SECONDS).until("#orders .list-group-item a").areDisplayed();
    }

    public void openOrder(String orderName) {
        click("#orders .list-group-item a", withText(orderName));
    }

    public void fillPaymentDetailsAndUpdateIt() {
        enterTransactionNumber("11111");
        //TO Do : Specify path relatively
        //enterPaymentProof("src/test/resource/images/TransactionProof.jpg");
        enterPaymentProof("src/test/resource/images/TransactionProof.jpg");
        submitTransationDetails();
    }

    private void submitTransationDetails() {
        find(".description-detail input").get(2).submit();
    }

    private void enterPaymentProof(String jpgFilePath) {
        fill(".description-detail input",withName("paymentProof")).with(jpgFilePath);
    }

    private void enterTransactionNumber(String transactionNo) {
        fill(".description-detail input",withName("transactionDetails")).with(transactionNo);
    }

    public void selectDeliveryMechanismExtract() {
        find("#distribution-details .col-md-1>input").get(3).click();
    }
}
