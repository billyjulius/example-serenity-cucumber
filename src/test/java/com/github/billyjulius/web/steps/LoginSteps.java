package com.github.billyjulius.web.steps;

import com.github.billyjulius.web.pages.*;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
    HomePage homePage;
    LoginPage loginPage;
    UserPage userPage;
    AdminLoginPage adminLoginPage;
    AdminPage adminPage;

    @Step
    public void openLoginPage() {
        homePage.open();
        homePage.clickLogin();
    }

    @Step
    public void inputEmailAndPassword() {
        loginPage.inputEmail("user@phptravels.com");
        loginPage.inputPassword("demouser");
        loginPage.submitLogin();
    }

    @Step
    public void inputInvalidEmailAndPassword() {
        loginPage.inputEmail("userdemo@phptravels.com");
        loginPage.inputPassword("demouser");
        loginPage.submitLogin();
    }

    @Step
    public void shouldSeeUserPage() {
        userPage.checkUserPage();
        userPage.checkUserMenu();
    }

    @Step
    public void shouldSeeErrorMessage() {
        loginPage.checkError();
    }

    @Step
    public void openAdminLoginPage() {
        adminLoginPage.open();
    }

    @Step
    public void inputAdminEmailAndPassword() {
        adminLoginPage.inputEmail("admin@phptravels.com");
        adminLoginPage.inputPassword("demoadmin");
        adminLoginPage.clickButtonLogin();
    }

    @Step
    public void shouldSeeAdminPage() {
        adminPage.checkSidebarMenuDisplayed();
    }

    @Step
    public void shouldSeeAdminDashboard() {
        adminPage.checkAdminPageContentDisplayed();
    }
}
