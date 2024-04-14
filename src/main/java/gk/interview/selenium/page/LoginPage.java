package gk.interview.selenium.page;

import gk.interview.selenium.base.NavigationBase;
import gk.interview.selenium.pageobject.LoginPageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends NavigationBase {


    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void login(String username, String password) {
        type(LoginPageObject.USERNAME, username);
        type(LoginPageObject.PASSWORD, password);
        click(LoginPageObject.SUBMIT);
    }

    public void verifyLoggedIn() {
        Assertions.assertEquals("Logged In Successfully", getElementText(LoginPageObject.LOGGED_IN));
    }
}
