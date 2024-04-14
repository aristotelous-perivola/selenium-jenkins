package gk.interview.selenium.pageobject;

import org.openqa.selenium.By;

public class LoginPageObject {

    public static By USERNAME = By.id("username");
    public static By PASSWORD = By.id("password");
    public static By SUBMIT = By.id("submit");
    public static By LOGGED_IN = By.className("post-title");
}
