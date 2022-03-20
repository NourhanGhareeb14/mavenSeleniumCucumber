@smoke
Feature: Register| users will be able to create account
  Scenario: user could create account
    Given user go to register screen
    When  user add all required data
     #And user select cart and check terms
     Then user create new account
