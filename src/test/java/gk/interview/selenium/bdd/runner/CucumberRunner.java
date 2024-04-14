package gk.interview.selenium.bdd.runner;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectDirectories("src/test/java/gk/interview/selenium/bdd/features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "gk.interview.selenium.bdd.stepdef")
@ConfigurationParameter(key = PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, value = "true")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "junit:target/cucumber-reports/Cucumber.xml, " +
        "html:target/cucumber-reports/Cucumber.html," +
        "json:target/cucumber-reports/Cucumber.json")
public class CucumberRunner {
}
