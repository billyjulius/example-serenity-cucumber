package com.github.billyjulius.web.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserPage extends PageObject {

    @FindBy(xpath = "(//div[@class='main-wrapper scrollspy-action'])[1]")
    WebElement pageContainer;

    @FindBy(xpath = "//ul[@class='menu-vertical-01']")
    WebElement sidebarMenu;


    public void checkUserPage() {
        element(pageContainer).shouldBeVisible();
    }

    public void checkUserMenu() {
        element(sidebarMenu).shouldBeVisible();
    }

    @FindBy(xpath = "(//a[text()='Invoice'])[5]")
    WebElement buttonInvoice;

    public void openUnpaidInvoice() {
        waitForCondition().until(ExpectedConditions.visibilityOf(element(By.xpath("(//div[@id='bookings']/div[@class='row'])[5]"))));
        buttonInvoice.click();
        Object[] windows = getDriver().getWindowHandles().toArray();
        getDriver().switchTo().window(windows[1].toString());
    }
}
