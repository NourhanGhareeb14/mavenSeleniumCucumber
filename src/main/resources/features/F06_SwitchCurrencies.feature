@smoke
Feature: F03_SwitchCurrencies | users will be able to  switch between currencies US-Euro

  Scenario: user could  switch between currencies US-Euro
    When user go to home page
    And user clicks on currencies field and user select Euro
    Then user view Euro is selected
