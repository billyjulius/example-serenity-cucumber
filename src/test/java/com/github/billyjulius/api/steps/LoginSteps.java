package com.github.billyjulius.api.steps;

import static com.github.billyjulius.api.Property.*;
import static net.serenitybdd.rest.SerenityRest.*;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import java.util.HashMap;
import java.util.Map;

public class LoginSteps {
    @Step
    public void setEmailAndPassword(String email, String password) {
        Serenity.setSessionVariable("email").to(email);
        Serenity.setSessionVariable("password").to(password);
    }

    @Step("Login to system API")
    public void login() {
        Map<String, Object> body = new HashMap<>();
        body.put("email", Serenity.sessionVariableCalled("email"));
        body.put("password", Serenity.sessionVariableCalled("password"));

        given().contentType("application/json")
            .body(body)
            .when().post(LOGIN);
    }

    @Step("Validate endpoint login response")
    public void validationLogin() {
        then().statusCode(200)
            .body(matchesJsonSchemaInClasspath("schema/LoginSuccess.json"));
    }
}
