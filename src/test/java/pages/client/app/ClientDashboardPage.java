package pages.client.app;

import static org.fluentlenium.core.filter.FilterConstructor.*;

import domain.client.app.VoucherSet;
import pages.BasePage;
import static org.junit.Assert.*;

public class ClientDashboardPage extends BasePage {

    @Override
    public String getUrl() {
        return "http://localhost:9000/client";
    }

    public void goToClientApp() {
        go();
    }

    public void clickCreateNewQuotationButton() {
        click(".btn-primary", withText("CREATE NEW QUOTATION +"));
    }

    public void enterQuotationTitle(String quoteTitle) {
        fill(".form-control",withName("name")).with(quoteTitle);
    }

    public void enterVoucherSetWith(int index, VoucherSet voucherSet) {
        //IF there are more then one vouchers then 'Add New Set'
        if (index > 0)
            click("#new-booklet-config");

        enterVoucherSetName(index,voucherSet.getName());
        enterVoucherSetQuantity(index, voucherSet.getQuantity());
        enterVoucherSetDenomination(index, voucherSet.getDenomination());
        enterVoucherSetDenominationQuantity(index, voucherSet.getDenominationQuantity());
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

    public void clickNext() {
        click(".actions a",withText("Next"));
    }
}
