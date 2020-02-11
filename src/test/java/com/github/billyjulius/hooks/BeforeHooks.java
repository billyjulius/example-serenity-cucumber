package com.github.billyjulius.hooks;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

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