package gk.interview.selenium.base;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

public interface DriverConfig {

    <T extends Capabilities> T getCapabilities();

    WebDriver configureDriver();


}
