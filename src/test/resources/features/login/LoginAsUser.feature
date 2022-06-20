@user
Feature: Login User
  In order to use many features in then website
  As a user
  I want to be able to login into the website

  @success
  Scenario: Login Successfully As User
    Given the user is in login page
    When the user submit account email and password
    Then they should see user page and menu

  @failed
  Scenario: Login Failed As User
    Given the user is in login page
    When the user submit invalid account login email and password
    Then they should see login failed error message
