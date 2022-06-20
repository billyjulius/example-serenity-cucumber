package com.github.billyjulius.web.steps;

import com.github.billyjulius.web.pages.*;
import net.thucydides.core.annotations.Step;

public class BookingsSteps {
    HomePage homePage;
    LoginPage loginPage;
    UserPage userPage;
    BookingsPage bookingsPage;

    @Step
    public void openUserDashboardPage() {
        homePage.open();
        homePage.clickLogin();

        loginPage.inputEmail("user@phptravels.com");
        loginPage.inputPassword("demouser");
        loginPage.submitLogin();
    }

    @Step
    public void openSidebarMenuMyBookings() {
        userPage.clickSidebarMenuMyBookings();
    }

    @Step
    public void shouldSeeBookingsStatus() {
        bookingsPage.checkTitleBookingsTable();
        bookingsPage.checkVisibleBookingsTable();
    }

    @Step
    public void shouldSeeWalletBalance() {
        bookingsPage.checkStatusText();
    }
}
