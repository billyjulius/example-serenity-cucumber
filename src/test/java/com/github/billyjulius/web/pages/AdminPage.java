package com.github.billyjulius.web.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends PageObject {
    @FindBy(xpath = "//div[@id='layoutDrawer_nav']")
    WebElement sidebarMenu;

    @FindBy(xpath = "//div[@id='layoutDrawer_content']")
    WebElement contentContainer;

    public void checkSidebarMenuDisplayed() {
        element(sidebarMenu).shouldBeVisible();
    }

    public void checkAdminPageContentDisplayed() {
        element(contentContainer).shouldBeVisible();
    }
}
