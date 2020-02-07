package com.github.billyjulius.web.steps;

import com.github.billyjulius.web.pages.*;
import net.thucydides.core.annotations.Step;

public class PaymentSteps {
    HomePage homePage;
    LoginPage loginPage;
    UserPage userPage;
    InvoicePage invoicePage;

    @Step
    public void openUserBookingPage() {
        homePage.open();
        homePage.clickLogin();

        loginPage.inputEmail("user@phptravels.com");
        loginPage.inputPassword("demouser");
        loginPage.submitLogin();
    }

    @Step
    public void openUserUnpaidInvoice() {
        userPage.openUnpaidInvoice();
    }

    @Step
    public void choosePayOnArrivalPayment() {
        invoicePage.clickButtonArrivalPay();
    }

    @Step
    public void shouldSeeBookingStatusIsReserved() {
        invoicePage.checkBookingStatusReserved();
    }
}
