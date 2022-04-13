@smoke
Feature: changeCategory | users will be able to change category
  Scenario: user could navigate to category
    When user go to category and assert on url
    And user select another category
    Then assert category changed
