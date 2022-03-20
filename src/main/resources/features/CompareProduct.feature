@smoke
Feature: compareproduct | users will be able to compare product
  Scenario: user could compare product
    When user go to product and add it to compare list
    And user select another product and add it to compare list
    Then open compare list and check the added product
