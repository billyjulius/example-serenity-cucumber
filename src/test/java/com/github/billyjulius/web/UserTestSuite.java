package com.github.billyjulius.web;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        tags="@user",
        plugin = {"json:target/cucumber/report.json"},
        glue={"com.github.billyjulius.web.definitions", "com.github.billyjulius.hooks"}
)
public class UserTestSuite {
}
