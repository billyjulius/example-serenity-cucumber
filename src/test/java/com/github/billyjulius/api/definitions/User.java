package com.github.billyjulius.api.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import com.github.billyjulius.api.steps.UserSteps;

public class User {
    @Steps
    UserSteps userSteps;

    @Given("the user have authorization to API")
    public void haveAuthorization() {

    }

    @When("the client get list of user")
    public void theClientGetListOfUser() {
        userSteps.getListOfUser();
    }

    @Then("they should get list of user response")
    public void theyShouldGetListOfUserResponse() {
        userSteps.validateListOfUser();
    }
}
