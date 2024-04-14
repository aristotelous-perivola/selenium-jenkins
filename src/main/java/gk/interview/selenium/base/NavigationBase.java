package gk.interview.selenium.base;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RequiredArgsConstructor
public class NavigationBase {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public WebElement waitUntilVisible(By by) {
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }

    public void click(By by) {
        waitUntilVisible(by).click();
    }

    public void type(By by, String text) {
        waitUntilVisible(by).sendKeys(text);
    }

    public String getElementText(By by) {
        return waitUntilVisible(by).getText();
    }
}
