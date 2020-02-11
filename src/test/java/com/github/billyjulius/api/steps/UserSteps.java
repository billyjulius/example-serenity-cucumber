package com.github.billyjulius.api.steps;

import static com.github.billyjulius.api.Property.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.*;
import net.thucydides.core.annotations.Step;

public class UserSteps {
    @Step
    public void getListOfUser() {
        given().contentType("application/json")
            .when().get(USERS);
    }

    @Step("Validation endpoint list users response")
    public void validateListOfUser() {
        then().statusCode(200)
            .body(matchesJsonSchemaInClasspath("schema/UsersList.json"));
    }
}
