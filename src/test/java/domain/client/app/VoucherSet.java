package domain.client.app;

/**
 * Created by abhi on 10/4/15.
 */
public class VoucherSet {
    private String name;
    private String quantity;
    private String denomination;
    private String denominationQuantity;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getDenominationQuantity() {
        return denominationQuantity;
    }

    public void setDenominationQuantity(String denominationQuantity) {
        this.denominationQuantity = denominationQuantity;
    }
}
