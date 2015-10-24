package pages;

import static org.fluentlenium.core.filter.FilterConstructor.*;

public class LoginPage extends BasePage{

    public boolean isPresent() {
        if (find(".form-control",withName("email")).isEmpty())
            return false;
        return true;
    }

    public void logInWith(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLogin();
    }

    private void clickLogin() {
        submit(".btn");
    }

    private void enterEmail(String email){
        fill(".form-control",withName("email")).with(email);

    }

    private void enterPassword(String password) {
        fill(".form-control",withName("password")).with(password);
    }
}
