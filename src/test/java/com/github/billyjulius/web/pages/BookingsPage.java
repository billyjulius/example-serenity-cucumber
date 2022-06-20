package com.github.billyjulius.web.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class BookingsPage extends PageObject {
    @FindBy(xpath = "//h3[@class='title']")
    WebElement titlelBookingsTable;

    @FindBy(xpath = "//div[@class='form-content']")
    WebElement bookingsTable;

    public void checkTitleBookingsTable() {
        element(titlelBookingsTable).shouldContainText("My Bookings");
    }

    public void checkVisibleBookingsTable() {
        element(bookingsTable).shouldBeVisible();
    }

    @FindBy(xpath = "//div[@class='info-content']/p[@class='info__desc']")
    List<WebElement> cardStatusText;

    public void checkStatusText() {
        String[] textArr = {"Wallet Balance", "Total Bookings", "Pending Invoices", "Reviews"};
        for (int i = 1; i<=cardStatusText.size(); i++) {
            String statusText = cardStatusText.get(i-1).getText();
            Assert.assertTrue(statusText.equals(textArr[i-1]));
        }
    }

}
