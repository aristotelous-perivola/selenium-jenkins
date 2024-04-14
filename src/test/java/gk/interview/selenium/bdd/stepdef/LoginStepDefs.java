package gk.interview.selenium.bdd.stepdef;

import gk.interview.selenium.base.TestBase;
import gk.interview.selenium.page.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs extends TestBase {

    LoginPage loginPage;

    @When("User logs in with valid credentials")
    public void userLogsInWithValidCredentials() {
        viewDriverInfo();
        loginPage = new LoginPage(driver, webDriverWait);
        loginPage.login("student", "Password123");

    }


    @Then("User is logged in")
    public void userIsLoggedIn() {
        loginPage.verifyLoggedIn();
    }
}
