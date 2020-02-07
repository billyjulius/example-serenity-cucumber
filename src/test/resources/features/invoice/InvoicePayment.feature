@user
Feature: Payment Invoice
  In order to get booking reserved
  As a user
  I want to be able to make payment unpaid invoice

  Scenario: Payment On Arrival Invoice
    Given the user is in user booking page
    When the user choose the unpaid invoice
    And the user choose to make payment on arrival
    Then they should see the booking status is reserved