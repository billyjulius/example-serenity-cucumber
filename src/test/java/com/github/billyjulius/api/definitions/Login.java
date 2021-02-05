package com.github.billyjulius.api.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import com.github.billyjulius.api.steps.LoginSteps;

public class Login {
    @Steps
    LoginSteps loginSteps;

    @Given("^the client have email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void theUserhaveUsernameAndPassword(String username, String password) {
        loginSteps.setEmailAndPassword(username, password);
    }

    @When("the client login through API")
    public void theClientLoginThroughAPI() {
        loginSteps.login();
    }

    @Then("they should login successfully")
    public void theyShouldLoginSuccessfully() {
        loginSteps.validationLogin();
    }
}
