package com.github.billyjulius.web.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageObject {
    @FindBy(css = ".dropdown-login")
    WebElement dropdownLogin;

    @FindBy(xpath = "//a[text()='Login']")
    WebElement buttonLogin;

    public void clickLogin() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(dropdownLogin));
        dropdownLogin.click();
        waitForCondition().until(ExpectedConditions.elementToBeClickable(buttonLogin));
        buttonLogin.click();
    }
}
