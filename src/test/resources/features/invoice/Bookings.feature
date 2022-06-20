@user
Feature: User Bookings
  In order to get booking reserved
  As a user
  I want to be able to make payment unpaid invoice

  Scenario: Check User Bookings
    Given the user is in user dashboard page
    When the user choose menu My Bookings
    Then user should see the bookings
    And user should see wallet balance