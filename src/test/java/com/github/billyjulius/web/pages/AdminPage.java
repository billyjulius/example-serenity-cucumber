package com.github.billyjulius.web.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends PageObject {
    @FindBy(xpath = "//ul[@id='social-sidebar-menu']")
    WebElement sidebarMenu;

    @FindBy(xpath = "//div[@id='content']")
    WebElement contentContainer;

    public void checkSidebarMenuDisplayed() {
        element(sidebarMenu).shouldBeVisible();
    }

    public void checkAdminPageContentDisplayed() {
        element(contentContainer).shouldBeVisible();
    }
}
