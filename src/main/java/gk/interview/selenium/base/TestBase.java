package gk.interview.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class TestBase {

    protected static WebDriver driver;

    protected static WebDriverWait webDriverWait;

    public void configureOnStartUp() {
        String browser = "chrome";
        String remoteUrl = "http://localhost:4444";
        WebDriver d;

        DriverType driverType = Arrays.stream(DriverType.values())
                .filter(dt-> dt.name().equalsIgnoreCase(browser))
                .findFirst().orElseThrow(() -> new RuntimeException(browser));

        if(remoteUrl!=null) {
            try {
                d = new RemoteWebDriver(new URL(remoteUrl), new ChromeOptions());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            driver = d;
        }
        else{
            driver = driverType.configureDriver();
        }

        webDriverWait = new WebDriverWait(driver, Duration.of(30, ChronoUnit.SECONDS));
    }


    public void goTo(String url) {
        driver.navigate().to(url);
    }

    public void viewDriverInfo() {
        System.out.println(driver.getCurrentUrl());
    }
}
