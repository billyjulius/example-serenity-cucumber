package com.github.billyjulius.web.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import com.github.billyjulius.web.steps.BookingsSteps;

public class Bookings {
    @Steps
    BookingsSteps bookingsSteps;

    @Given("the user is in user dashboard page")
    public void userIsInUserDashboardPage() {
        bookingsSteps.openUserDashboardPage();
    }

    @When("the user choose menu My Bookings")
    public void userChooseMenuMyBookings() {
        bookingsSteps.openSidebarMenuMyBookings();
    }

    @Then("user should see the bookings")
    public void userShouldSeeBookingStatus() {
        bookingsSteps.shouldSeeBookingsStatus();
    }

    @And("user should see wallet balance")
    public void userShouldSeeWalletBalance() {
        bookingsSteps.shouldSeeWalletBalance();
    }
}
