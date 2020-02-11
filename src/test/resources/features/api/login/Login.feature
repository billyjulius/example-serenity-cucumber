@api
Feature: Login
  In order to use many endpoint in system API
  As a user
  I want to be able to login through API

  Scenario: Login Successfully
    Given the client have email "eve.holt@reqres.in" and password "cityslicka"
    When the client login through API
    Then they should login successfully