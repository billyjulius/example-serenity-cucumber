package com.github.billyjulius.web.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InvoicePage extends PageObject {
    @FindBy(xpath = "//button[contains(@class, 'arrivalpay')]")
    WebElement buttonArrivalPay;

    @FindBy(xpath = "//div[@class='content']/h4")
    WebElement textBookingStatus;

    public void clickButtonArrivalPay() {
        waitForCondition().until(ExpectedConditions.visibilityOf(buttonArrivalPay));
        buttonArrivalPay.click();
        getDriver().switchTo().alert().accept();
    }

    public void checkBookingStatusReserved() {
        waitForCondition().until(ExpectedConditions.visibilityOf(textBookingStatus));
        Assert.assertEquals("Your booking status is Reserved", textBookingStatus.getText());
    }
}
