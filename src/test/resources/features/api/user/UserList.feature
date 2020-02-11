@api
Feature: User List
  In order to manage user data
  As a user
  I want to be able get list of user through API

  Scenario: Get List of User
    Given the user have authorization to API
    When the client get list of user
    Then they should get list of user response