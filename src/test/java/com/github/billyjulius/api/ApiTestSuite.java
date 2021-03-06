package com.github.billyjulius.api;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/api",
        glue="com.github.billyjulius.api.definitions"
)
public class ApiTestSuite {
}
