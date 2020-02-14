package com.github.billyjulius.web;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        tags="@user",
        plugin = {"html:target/cucumber", "json:target/cucumber/report.json"},
        glue={"com.github.billyjulius.web.definitions", "com.github.billyjulius.hooks"}
)
public class UserTestSuite {
}
