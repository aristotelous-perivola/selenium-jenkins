package gk.interview.selenium.bdd.stepdef.hooks;

import gk.interview.selenium.base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends TestBase {

    @Before
    public void before() {
        configureOnStartUp();
        goTo("https://practicetestautomation.com/practice-test-login/");
    }

    @After
    public void after(Scenario scenario) {
        driver.quit();
    }
}
