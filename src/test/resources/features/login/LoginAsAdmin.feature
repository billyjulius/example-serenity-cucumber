@admin
Feature: Login Admin
  In order to control and monitor website data
  As a user
  I want to be able to login as admin into the website

  Scenario: Login Successfully As Admin
    Given the user is in admin login page
    When the user submit admin account email and password
    Then they should see admin page and menu