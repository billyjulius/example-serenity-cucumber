package com.github.billyjulius.web.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.phptravels.net/admin")
public class AdminLoginPage extends PageObject {
    @FindBy(name = "email")
    WebElement fieldEmail;

    @FindBy(name = "password")
    WebElement fieldPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonLogin;

    public void inputEmail(String email) {
        fieldEmail.sendKeys(email);
    }

    public void inputPassword(String password) {
        fieldPassword.sendKeys(password);
    }

    public void clickButtonLogin() {
        buttonLogin.click();
    }
}
