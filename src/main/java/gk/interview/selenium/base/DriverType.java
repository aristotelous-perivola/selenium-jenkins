package gk.interview.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public enum DriverType implements DriverConfig {

    CHROME {
        @Override
        public ChromeOptions getCapabilities() {
            Map<String, String> prefs = new HashMap<>();
            prefs.put("download.prompt_for_download", "false");
            prefs.put("download.default_directory",System.getProperty("user.dir") + File.separator + "src/test/resources/downloads");
            prefs.put("safebrowsing.enabled", "true");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized", "--ignore-certificate-errors");
            options.setExperimentalOption("prefs", prefs);
            if (Boolean.parseBoolean("false")) {
                options.addArguments("headless");
            }
            return options;
        }

        @Override
        public WebDriver configureDriver() {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver(getCapabilities());
        }
    }

}
