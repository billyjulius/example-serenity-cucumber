package com.github.billyjulius.web.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import com.github.billyjulius.web.steps.PaymentSteps;

public class InvoicePayment {
    @Steps
    PaymentSteps paymentSteps;

    @Given("the user is in user booking page")
    public void theUserIsInUserBookingPage() {
        paymentSteps.openUserBookingPage();
    }

    @When("the user choose the unpaid invoice")
    public void theUserChooseTheUnpaidInvoice() {
        paymentSteps.openUserUnpaidInvoice();
    }

    @And("the user choose to make payment on arrival")
    public void theUserChooseToMakePaymentOnArrival() {
        paymentSteps.choosePayOnArrivalPayment();
    }

    @Then("they should see the booking status is reserved")
    public void theyShouldSeeTheBookingStatusIsReserved() {
        paymentSteps.shouldSeeBookingStatusIsReserved();
    }
}
