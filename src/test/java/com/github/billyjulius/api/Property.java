package com.github.billyjulius.api;

import net.serenitybdd.core.environment.ConfiguredEnvironment;

public final class Property {
    public static final String HOST = ConfiguredEnvironment.getEnvironmentVariables().getProperty("api.host");
    public static final String LOGIN = HOST + "/login";
    public static final String USERS = HOST + "/users";
}
