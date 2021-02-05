package com.github.billyjulius.web.definitions;

import com.github.billyjulius.web.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Login {
    @Steps
    LoginSteps loginSteps;

    @Given("the user is in login page")
    public void theUserIsInLoginPage() {
        loginSteps.openLoginPage();
    }

    @When("the user submit account email and password")
    public void theUserSubmitAccountEmailAndPassword() {
        loginSteps.inputEmailAndPassword();
    }

    @Then("they should see user page and menu")
    public void theyShouldSeeUserPageAndMenu() {
        loginSteps.shouldSeeUserPage();
    }

    @When("the user submit invalid account login email and password")
    public void theUserSubmitInvalidAccountLoginEmailAndPassword() {
        loginSteps.inputInvalidEmailAndPassword();
    }

    @Then("they should see login failed error message")
    public void theyShouldSeeLoginFailedErrorMessage() {
        loginSteps.shouldSeeErrorMessage();
    }

    @Given("the user is in admin login page")
    public void theUserIsInAdminLoginPage() {
        loginSteps.openAdminLoginPage();
    }

    @When("the user submit admin account email and password")
    public void theUserSubmitAdminAccountEmailAndPassword() {
        loginSteps.inputAdminEmailAndPassword();
    }

    @Then("they should see admin page and menu")
    public void theyShouldSeeAdminPageAndMenu() {
        loginSteps.shouldSeeAdminPage();
        loginSteps.shouldSeeAdminDashboard();
    }
}
