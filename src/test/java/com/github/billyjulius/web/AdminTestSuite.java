package com.github.billyjulius.web;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        tags="@admin",
        glue={"com.github.billyjulius.web.definitions", "com.github.billyjulius.hooks"}
)
public class AdminTestSuite {}
