package com.billyjulius.driver.capabilites;

import net.serenitybdd.core.webdriver.enhancers.BeforeAWebdriverScenario;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.SupportedWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

class CustomCapabilites implements BeforeAWebdriverScenario {

    @Override
    public DesiredCapabilities apply(EnvironmentVariables environmentVariables,
                                     SupportedWebDriver driver,
                                     TestOutcome testOutcome,
                                     DesiredCapabilities capabilities) {

        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "80");
        capabilities.setCapability("platform", "WINDOWS");
        capabilities.setCapability("javascriptEnabled", true);

        return capabilities;
    }
}