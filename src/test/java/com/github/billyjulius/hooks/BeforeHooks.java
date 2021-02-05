package com.github.billyjulius.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class BeforeHooks {
    @After
    public void actionAfter() {
        // Closing Browser, Clearing Database, Reset Configuration, etc
    }

    @Before
    public void actionBefore() {
        // Set browser cookie, Initializing Database, etc
    }

    @AfterStep
    public void actionAfterStep() {
        // Capture screenshot, Call backend API, etc
    }

    @BeforeStep
    public void actionBeforeStep() {
        // Capture screenshot, Call backend API, etc
    }
}