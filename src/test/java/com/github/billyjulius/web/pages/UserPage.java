package com.github.billyjulius.web.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserPage extends PageObject {

    @FindBy(xpath = "//div[@class='dashboard-content-wrap']")
    WebElement pageContainer;

    @FindBy(xpath = "//div[@class='sidebar-nav']")
    WebElement sidebarMenu;


    public void checkUserPage() {
        element(pageContainer).shouldBeVisible();
    }

    public void checkUserMenu() {
        element(sidebarMenu).shouldBeVisible();
    }

    @FindAll(@FindBy(xpath = "//div[@id='bookings']/div[@class='row']"))
    List<WebElement> rowBookings;

    @FindBy(xpath = "//ul[contains(@class, 'sidebar-menu')]/li/a[text()=' My Bookings']")
    WebElement sidebarMenuMyBookings;

    public void clickSidebarMenuMyBookings() {
        sidebarMenuMyBookings.click();
    }

    public void openUnpaidInvoice() {
        int unpaid_row = 0;
        for (int i = 1; i<=rowBookings.size(); i++) {
            String statusBooking = rowBookings.get(i-1).findElement(By.xpath("//div[@class='col-md-2 o2']/h5/strong/span")).getText();
            if(statusBooking.equalsIgnoreCase("unpaid")) {
                unpaid_row = i;
                break;
            }
        }
        if(unpaid_row == 0) System.out.println("Booking with status Unpaid Not Found");

        WebElement buttonInvoice = getDriver().findElement(By.xpath("(//a[text()='Invoice'])["+ Integer.toString(unpaid_row) +"]"));
        buttonInvoice.click();
        Object[] windows = getDriver().getWindowHandles().toArray();
        getDriver().switchTo().window(windows[1].toString());
    }
}
