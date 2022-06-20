package com.github.billyjulius.web.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy(xpath = "//input[@type='email'][@class='form-control']")
    WebElement textFieldUsername;

    @FindBy(xpath = "//input[@type='password'][@class='form-control']")
    WebElement textFieldUPassword;

    @FindBy(css = ".btn-lg")
    WebElement buttonLogin;

    public void inputEmail(String email) {
        textFieldUsername.sendKeys(email);
    }

    public void inputPassword(String password) {
        textFieldUPassword.sendKeys(password);
    }

    public void submitLogin() {
        buttonLogin.click();
    }

    @FindBy(css = ".alert-danger")
    WebElement alertError;

    public void checkError() {
        element(alertError).shouldBeVisible();
        Assert.assertEquals("Wrong credentials. try again!", alertError.getText());
    }
}
