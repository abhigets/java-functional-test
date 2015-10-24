package domain.staff.portal;

public class DistributionRecipientDetails {
    private String name;
    private String quantity;
    private String email;

    public DistributionRecipientDetails(){
        name = "New Name";
        quantity = "1";
        email = "abhi.gets.mail@gmail.com";
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
